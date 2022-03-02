package com.igtecsolucoestecnologicas.recycleview;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.igtecsolucoestecnologicas.recycleview.Model.Email;

import java.util.ArrayList;

public class EmailAdapter extends RecyclerView.Adapter<EmailAdapter.EmailViewHolder>{

    private final ArrayList<Email> emails;

    public EmailAdapter(ArrayList<Email> emails) {
        this.emails = emails;
    }

    @NonNull
    @Override
    public EmailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Inflar o Layout
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.email_item,
                parent,
                 false
        );

        //Retorna a minha inflada
        return new EmailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmailViewHolder holder, int position) {
        //Componentes da ViewHolder
        Email email = emails.get(position);
        holder.bind(email);
    }

    @Override
    public int getItemCount() {
        //Retorna a quantidade de itens da lista
        return emails.size();
    }

    class EmailViewHolder extends RecyclerView.ViewHolder{

        TextView txt_icon;
        TextView txt_user;
        TextView txt_subject;
        TextView txt_preview;
        TextView txt_date;

        ImageView imgStar;

        public EmailViewHolder(@NonNull View itemView) {
            super(itemView);

            //Componentes
            txt_icon = itemView.findViewById(R.id.txt_icon_email);
            txt_user = itemView.findViewById(R.id.user);
            txt_subject = itemView.findViewById(R.id.txt_subject);
            txt_preview = itemView.findViewById(R.id.txt_email_preview);
            txt_date = itemView.findViewById(R.id.txt_date);

            imgStar = itemView.findViewById(R.id.imv_estrela);
        }

        public void bind(Email email) {

            //Hash do nome
            int hash = email.getUser().hashCode();

            //Icone com a primeira letra do Usuário
            txt_icon.setText(String.valueOf(
                    email.getUser().charAt(0)
            ));

            txt_user.setText(email.getUser());
            txt_subject.setText(email.getSubject());
            txt_preview.setText(email.getPreview());
            txt_date.setText(email.getDate());

            //Modifica a cor
            txt_icon.setBackground(
                    oval(Color.rgb(hash, hash/2, 0),
                            txt_icon)
            );

            //Marcar User e Subject
            txt_user.setTypeface(Typeface.DEFAULT, email.isUnread() ? Typeface.BOLD :  Typeface.NORMAL);
            txt_subject.setTypeface(Typeface.DEFAULT, email.isUnread() ? Typeface.BOLD :  Typeface.NORMAL);
            txt_date.setTypeface(Typeface.DEFAULT, email.isUnread() ? Typeface.BOLD :  Typeface.NORMAL);

            //Marca ou desmarca a estrela
            imgStar.setImageResource(
                    email.isStared() ? R.drawable.ic_estrela_completa_24 : R.drawable.ic_estrela_24
            );

        }
    }

    private static ShapeDrawable oval(@ColorInt int color, View view){
        //Criar o drawable
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());

        //Seta as propriedades
        shapeDrawable.setIntrinsicWidth(view.getWidth());
        shapeDrawable.setIntrinsicHeight(view.getHeight());

        //Modifica a cor
        shapeDrawable.getPaint().setColor(color);

        //Retorna o Shape
        return shapeDrawable;
    }
}
