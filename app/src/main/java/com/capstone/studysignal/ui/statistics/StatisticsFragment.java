package com.capstone.studysignal.ui.statistics;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.capstone.studysignal.R;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.List;

public class StatisticsFragment extends Fragment {
    View v;
    LineChart lineChart1;
    LineChart lineChart2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v =  inflater.inflate(R.layout.fragment_statistics, container, false);

        lineChart1 = (LineChart) v.findViewById(R.id.lineChart1);
        lineChart2 = (LineChart) v.findViewById(R.id.lineChart2);

        List<Entry> entries = new ArrayList<>();
        entries.add(new Entry(1,0));
        entries.add(new Entry(2,70));
        entries.add(new Entry(3,90));
        entries.add(new Entry(4,80));
        entries.add(new Entry(5,40));
        entries.add(new Entry(6,60));
        entries.add(new Entry(7,90));
        entries.add(new Entry(8,80));
        entries.add(new Entry(9,40));
        entries.add(new Entry(10,100));
        entries.add(new Entry(11,40));
        entries.add(new Entry(12,100));

        List<Entry> entries2 = new ArrayList<>();
        entries2.add(new Entry(1,0));
        entries2.add(new Entry(2,70));
        entries2.add(new Entry(3,100));
        entries2.add(new Entry(4,80));
        entries2.add(new Entry(5,40));
        entries2.add(new Entry(6,60));
        entries2.add(new Entry(7,90));

        //연간
        LineDataSet dataSet = new LineDataSet(entries, "Label");
        dataSet.setLineWidth(4); //라인 두께
        dataSet.setCircleRadius(6); // 점 크기
        dataSet.setCircleColor(Color.parseColor("#FFA1B4DC")); // 점 색깔
        dataSet.setDrawCircleHole(true); // 원의 겉 부분 칠할거?
        dataSet.setColor(Color.parseColor("#FFA1B4DC")); // 라인 색깔

        LineData lineData = new LineData(dataSet);
        lineChart1.setData(lineData);
        lineChart1.invalidate();

        //주간
        LineDataSet dataSet2 = new LineDataSet(entries2, "Label");
        dataSet2.setLineWidth(4); //라인 두께
        dataSet2.setCircleRadius(6); // 점 크기
        dataSet2.setCircleColor(Color.parseColor("#FFA1B4DC")); // 점 색깔
        dataSet2.setDrawCircleHole(true); // 원의 겉 부분 칠할거?
        dataSet2.setColor(Color.parseColor("#FFA1B4DC")); // 라인 색깔

        LineData lineData2 = new LineData(dataSet2);
        lineChart2.setData(lineData2);
        lineChart2.invalidate();

        return v;
    }

}