package android.suryadevs.com.firebasefamilylist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    final List<RowContent> row = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

            row.add(new RowContent("http://emojipedia-us.s3.amazonaws.com/cache/b5/3d/b53d51c04f148e9609d0cc61da84e8bf.png",
                    "", ""));
            row.add(new RowContent("http://emojipedia-us.s3.amazonaws.com/cache/10/41/1041ca214bafceb4a489790a62af8400.png",
                    "", ""));
            row.add(new RowContent("http://www.hey.fr/tools/emoji/ios_emoji_man.png",
                    "", ""));
            row.add(new RowContent("http://emojipop.net/data/images/emoji_set_67.png",
                    "", ""));
            row.add(new RowContent("https://lh3.googleusercontent.com/ZBX0ORBpbnTigeE_t8k0nZoeHXJ6arxHJlYw9wc4MBdjjoBejn8-jBp4JpWZ4zXqZQ=w170",
                    "", ""));
            row.add(new RowContent("https://www.emojibase.com/resources/img/emojis/apple/x1f472.png.pagespeed.ic.qo7E3YVsBi.png",
                    "", ""));
            row.add(new RowContent("http://emojipedia-us.s3.amazonaws.com/cache/94/72/9472106a702f9ab0dbf31e2281952e49.png",
                    "", ""));
            row.add(new RowContent("http://emojipedia-us.s3.amazonaws.com/cache/4c/07/4c075ad28aeab5b5686904eb3e9ef976.png",
                    "", ""));
            row.add(new RowContent("http://emojipedia-us.s3.amazonaws.com/cache/da/5a/da5aec861718f2a9336674d83f62cb4b.png",
                    "", ""));

        FamilyAdapter adapter = new FamilyAdapter(this,row);
        ListView list = (ListView) findViewById(R.id.family_listview); //getting the listview by id
        list.setAdapter(adapter);
    }
}
