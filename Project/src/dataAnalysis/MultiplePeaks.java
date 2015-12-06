package dataAnalysis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class to find frames of video that are detected to have more than one peak.
 * Input is a text file
 * 
 * @author Kiran
 *
 */
public class MultiplePeaks {

	public static void main(String[] args) {

		String peakFilePath = "C:\\Users\\Kiran\\Documents\\Project\\Matlab Files\\Peak Lock Data\\45.txt";
		BufferedReader br = null;
		ArrayList<DataPoint> data = null;
		ArrayList<DataPoint> multPeaksData;

		try {
			br = brFromFile(peakFilePath);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try {
			data = dataPointArrayList(br);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		multPeaksData = findPointsMultiplePeaks(data);

	}

	// BufferedReader object to read URL
	private static BufferedReader brFromFile(String fileName) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		return br;
	}

	// HashMap of all the data
	private static ArrayList<DataPoint> dataPointArrayList(BufferedReader br) throws IOException {
		ArrayList<DataPoint> dataArrayList = new ArrayList<DataPoint>();
		String s;
		Scanner sc;
		br.readLine();
		double frame;
		while ((s = br.readLine()) != null) {
			sc = new Scanner(s);

			double x = sc.nextDouble();
			double y = sc.nextDouble();
			frame = sc.nextDouble();

			DataPoint dp = new DataPoint(x, y, frame);
			dataArrayList.add(dp);
			// System.out.println(dp);
		}
		return dataArrayList;
	}

	private static ArrayList<DataPoint> findPointsMultiplePeaks(ArrayList<DataPoint> data) {
		ArrayList<DataPoint> multPeaks = new ArrayList<DataPoint>();
		double frame;
		frame = data.get(0).get_frame();
		for (int i = 1; i < data.size(); ++i) {
			if (frame == data.get(i).get_frame()) {
				multPeaks.add(data.get(i));
				System.out.println(data.get(i - 1));
				System.out.println(data.get(i));
			}
			frame = data.get(i).get_frame();
		}
		return multPeaks;
	}

}
