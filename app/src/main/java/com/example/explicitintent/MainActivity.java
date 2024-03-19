@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
}

public void newsScreen(View view) {
    Intent i = new Intent(getApplicationContext(), MainActivity2.class);
    startActivity(i);
}
