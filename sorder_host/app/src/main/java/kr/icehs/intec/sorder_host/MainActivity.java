package kr.icehs.intec.sorder_host;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView wView;
    WebSettings wSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wView = (WebView)findViewById(R.id.wView);
        wView.loadUrl("http://192.168.0.38:8080/?action=stream");
        wSetting = wView.getSettings();
        wSetting.setSupportZoom(false); // 화면 줌 허용 여부
        wSetting.setBuiltInZoomControls(false); // 화면 확대 축소 허용 여부
        wSetting.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN); // 컨텐츠 사이즈 맞추기
        // 화면 비율
        wSetting.setUseWideViewPort(true);       // wide viewport를 사용하도록 설정
        wSetting.setLoadWithOverviewMode(true);  // 컨텐츠가 웹뷰보다 클 경우 스크린 크기에 맞게 조정
    }
}
