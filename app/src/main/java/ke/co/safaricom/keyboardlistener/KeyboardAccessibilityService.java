package ke.co.safaricom.keyboardlistener;

import android.accessibilityservice.AccessibilityService;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Toast;

public class KeyboardAccessibilityService extends AccessibilityService {


    @Override
    public void onCreate() {
        super.onCreate();

        Toast.makeText(this, "Creating Keyboard Listener Service", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Starting Keyboard Listener Service", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    protected boolean onKeyEvent(KeyEvent event) {
        Toast.makeText(this, "Key : " + event.getCharacters(), Toast.LENGTH_SHORT).show();
        return super.onKeyEvent(event);
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        int eventType = event.getEventType();
        Toast.makeText(this, "Event : " + eventType, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onInterrupt() {
        Toast.makeText(this, "Interrupt Listener Service", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Destroy Keyboard Listener Service", Toast.LENGTH_SHORT).show();
    }
}
