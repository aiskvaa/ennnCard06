package com.example.android3lesson2.data.local.client;

import com.example.android3lesson2.R;
import com.example.android3lesson2.models.viewpager_model.ViewPagerModel;

import java.util.ArrayList;

public class ViewPagerClient {
    public ArrayList<ViewPagerModel> list = new ArrayList<>();

    public ArrayList<ViewPagerModel> getList() {
        list.add(new ViewPagerModel("Категории", "Создавайте собственные категории для слов", R.drawable.words));
        list.add(new ViewPagerModel("Слово", "Создавайте слова на английском и кликайте на карточку чтобы увидеть его перевод и картинку для ассоциации", R.drawable.english));
        list.add(new ViewPagerModel("Изучение", "Свайпайте карточку вправо если вы запомнили,влево если пока ещё не уверены", R.drawable.en1));
        list.add(new ViewPagerModel("Личный кабинет", "Следите за своими ачивками и количеством очков опыта", R.drawable.people));
        list.add(new ViewPagerModel("Давай начнем!", "Let's do it!", R.drawable.ill));
        return list;

    }
}
