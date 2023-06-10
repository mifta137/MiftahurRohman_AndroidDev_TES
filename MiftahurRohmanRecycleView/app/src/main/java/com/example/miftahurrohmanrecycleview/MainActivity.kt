import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
//
//class MainActivity : AppCompatActivity() {
//    private lateinit var recyclerView: RecyclerView
//    private lateinit var adapter: RecyclerViewAdapter
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        recyclerView = findViewById(R.id.recyclerView)
//        adapter = RecyclerViewAdapter(getDummyData()) // Replace with your data source
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.adapter = adapter
//    }
//
//    // Replace this method with your own data source
//    private fun getDummyData(): List<String> {
//        return listOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5")
//    }
//}

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: RecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResourceID())

        recyclerView = findViewById(getRecyclerViewID())
        adapter = RecyclerViewAdapter(getDummyData())
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    private fun getLayoutResourceID(): Int {
        // Replace with your actual layout resource ID
        return resources.getIdentifier("activity_main", "layout", packageName)
    }

    private fun getRecyclerViewID(): Int {
        // Replace with your actual RecyclerView ID
        return resources.getIdentifier("recyclerView", "id", packageName)
    }

    private fun getDummyData(): List<String> {
        return listOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5")
    }
}

