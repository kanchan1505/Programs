package com.example.kanchankumari.tictactoe_game;

import android.os.Message;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,res;
    int player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        res=(Button)findViewById(R.id.res);
          player=1;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(b1.getText().toString().equals("")) {
                    if (player==1) {
                        player=2;
                        b1.setText("X");
                    }

                else if(player==2) {
                        player = 1;
                        b1.setText("0");
                    }
                }
                endGame();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b2.getText().toString().equals("")) {
                    if (player == 1) {
                        player = 2;
                        b2.setText("X");
                    }
                 else if (player == 2) {
                    player = 1;
                    b2.setText("0");

                }
            }
                endGame();
            }

        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            if(b3.getText().toString().equals("")) {
                if (player == 1) {
                    player = 2;
                    b3.setText("X");
                } else if (player == 2) {
                    player = 1;
                    b3.setText("0");

                }
            }
                endGame();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(b4.getText().toString().equals("")) {
                    if (player == 1) {
                        player = 2;
                        b4.setText("X");
                    } else if (player == 2) {
                        player = 1;
                        b4.setText("0");

                    }
                }
                endGame();

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b5.getText().toString().equals("")) {
                    if (player==1) {
                        player = 2;
                        b5.setText("X");
                    }

                else if(player==2) {
                        player = 1;
                        b5.setText("0");
                    }
                }

                endGame();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b6.getText().toString().equals("")) {
                    if (player==1) {
                        player = 2;
                        b6.setText("X");
                    }

                else if(player==2) {
                        player = 1;
                        b6.setText("0");
                    }
                }
                endGame();

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b7.getText().toString().equals("")) {
                    if (player==1) {
                        player = 2;
                        b7.setText("X");

                }
                else if(player==2) {
                        player = 1;
                        b7.setText("0");
                    }
                }
                endGame();

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b8.getText().toString().equals("")) {
                    if (player == 1) {
                        player = 2;
                        b8.setText("X");

                } else if (player == 2) {
                    player = 1;
                    b8.setText("0");

                }
            }
                endGame();

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b9.getText().toString().equals("")) {
                    if (player == 1) {
                        player = 2;
                        b9.setText("X");

                    } else if (player == 2) {
                        player = 1;
                        b9.setText("0");

                    }
                }
                endGame();

            }
        });




    }

    public void endGame()
    {   Boolean end=false;
        String a,b,c,d,e,f,g,h,i;
        a=b1.getText().toString();
        b=b2.getText().toString();
        c=b3.getText().toString();
        d=b4.getText().toString();
        e=b5.getText().toString();
        f=b6.getText().toString();
        g=b7.getText().toString();
        h=b8.getText().toString();
        i=b9.getText().toString();


        if(a.equals("X")&&b.equals("X")&&c.equals("X"))
        {
            Toast.makeText(MainActivity.this,"Player 'X' Wins!",Toast.LENGTH_LONG).show();
          end=true;
        }
        if(a.equals("X")&&d.equals("X")&&g.equals("X"))
        {
            Toast.makeText(MainActivity.this,"Player 'X' Wins!",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(a.equals("X")&&e.equals("X")&&i.equals("X"))
        {
            Toast.makeText(MainActivity.this,"Player 'X' Wins!",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(b.equals("X")&&e.equals("X")&&h.equals("X"))
        {
            Toast.makeText(MainActivity.this,"Player 'X' Wins!",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(c.equals("X")&&f.equals("X")&&i.equals("X"))
        {
            Toast.makeText(MainActivity.this,"Player 'X' Wins!",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(g.equals("X")&&h.equals("X")&&i.equals("X"))
        {
            Toast.makeText(MainActivity.this,"Player 'X' Wins!",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(d.equals("X")&&e.equals("X")&&f.equals("X"))
        {
            Toast.makeText(MainActivity.this,"Player 'X' Wins!",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(c.equals("X")&&e.equals("X")&&g.equals("X"))
        {
            Toast.makeText(MainActivity.this,"Player 'X' Wins!",Toast.LENGTH_LONG).show();
            end=true;
        }

        if(a.equals("0")&&b.equals("0")&&c.equals("0"))
        {
            Toast.makeText(MainActivity.this,"Player '0' Wins!",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(a.equals("0")&&d.equals("0")&&g.equals("0"))
        {
            Toast.makeText(MainActivity.this,"Player '0' Wins!",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(a.equals("0")&&e.equals("0")&&i.equals("0"))
        {
            Toast.makeText(MainActivity.this,"Player '0' Wins!",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(b.equals("0")&&e.equals("0")&&h.equals("0"))
        {
            Toast.makeText(MainActivity.this,"Player '0' Wins!",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(c.equals("0")&&f.equals("0")&&i.equals("0"))
        {
            Toast.makeText(MainActivity.this,"Player '0' Wins!",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(g.equals("0")&&h.equals("0")&&i.equals("0"))
        {
            Toast.makeText(MainActivity.this,"Player '0' Wins!",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(d.equals("0")&&e.equals("0")&&f.equals("0"))
        {
            Toast.makeText(MainActivity.this,"Player '0' Wins!",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(c.equals("0")&&e.equals("0")&&g.equals("0"))
        {
            Toast.makeText(MainActivity.this,"Player '0' Wins!",Toast.LENGTH_LONG).show();
            end=true;
        }
        if(end)
        {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);

        }


    }
    public void onRestart(View v)
    {


        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);


        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");


    }
}
