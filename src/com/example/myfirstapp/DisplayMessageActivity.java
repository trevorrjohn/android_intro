public class DisplayMessageActivity extends Activity {

  @SuppressLint("NewApi")
  @Override
  protected void onCreate(Bundle saveInstanceState) {

    super.onCreate(saveInstanceState);
    setCurrentView(R.layout.activity_display_message);

    // Version check
    if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
      getActionBar().setDisplayHomeAsUpEnabled(true);
    }
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    switch(item.getItemId()) {
    case android.R.id.home:
      NavUtils.navigateUpFromSameTask(this);
      return true;
    }
    return super.onOptionsItemSelected(item);
  }

  @Override
  public void onCreate(Bundle saveInstanceState) {

    super.onCreate(saveInstanceState);

    // Gets message from intent
    Intent intent = getIntent();
    String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

    // Create the text view
    TextView textView = new TextView(this);
    textView.setTextSize(40);
    textView.setText(message);

    // Place text view in window
    setContentView(textView);
  }
}

