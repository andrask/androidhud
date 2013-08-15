package com1.example.something;

import android.app.Activity;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.VideoView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		DrawView drawView = new DrawView(this);
        drawView.setBackgroundColor(Color.WHITE);
        drawView.setLayoutParams(new LayoutParams(50, 50));
        
        FrameLayout frame = (FrameLayout) findViewById(R.id.frame);
        
        VideoView videoView = (VideoView) findViewById(R.id.videoView1);
        videoView.setVideoURI(Uri.parse("http://www.pocketjourney.com/downloads/pj/video/famous.3gp"));
        videoView.start();
        
        frame.addView(drawView);
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
