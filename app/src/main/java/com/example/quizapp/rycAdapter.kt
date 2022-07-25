package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar


class rycAdapter(private val optlist:ArrayList<cato>) : RecyclerView.Adapter<rycAdapter.ViewHolder>()
{
    companion object{
        var Namo = ""
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.ryc, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cato =optlist[position]
        holder.imageView.setImageResource(cato.img)
        holder.textView.text=cato.name
        holder.textViews.text=cato.diff
    }

    override fun getItemCount(): Int {
        return optlist.size
    }

    class ViewHolder(ItemView : View):RecyclerView.ViewHolder(ItemView){
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.tatti)
        val textViews: TextView = itemView.findViewById(R.id.tatte)
        init {
            itemView.setOnClickListener{
                val snack:String = "item click$adapterPosition"
                Snackbar.make(itemView, snack, Snackbar.LENGTH_SHORT).show()
                if(adapterPosition==0)
                {
                    val intent=Intent(itemView.context,MainActivity2::class.java)
                    val bundle = Bundle()
                    bundle.putString(MainActivity2.sharabi, Namo)

                    intent.putExtras(bundle)

                    itemView.context.startActivity(intent)
                }
                else if(adapterPosition==1){
                val intent=Intent(itemView.context,MainActivity21::class.java)
                val bundle = Bundle()
                bundle.putString(MainActivity2.sharabi, Namo)
                intent.putExtras(bundle)
                itemView.context.startActivity(intent)

                }
            }
        }

}

    }

