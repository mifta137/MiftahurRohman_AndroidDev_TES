class RecyclerViewAdapter(private val data: List<String>, private val layoutResourceID: Int) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            layoutResourceID,
            parent,
            false
        )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.itemText.text = item
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val itemText: TextView = view.findViewById(getItemTextID())

        private fun getItemTextID(): Int {
            return itemView.resources.getIdentifier(
                "itemText",
                "id",
                itemView.context.packageName
            )
        }
    }
}
