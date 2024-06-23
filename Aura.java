import java.util.*;
public class Aura
{
    public String name;
    public String surname;
    public int aura;

    public Aura (String name, String surname, int aura)
    {
        this.name = name;
        this.surname = surname;
        this.aura = aura;
    }

    public void Day1 ()
    {
        System.out.println("День 1: Илья просыпается в 4 утра");
        System.out.println("Выберите дальнейшее действие:\n"+
                           "1 - Встать с кровати\n"+
                           "2 - Спать дальше");
        Scanner sc = new Scanner (System.in);
        int a  = sc.nextInt();
        System.out.println();
        switch (a)
        {
            case 1:
            {
                aura+=1000;
                System.out.println("Илья встал с кровати и начал новый день на продуктивном\n" +
                "Счётчик ауры:"+" "+aura);
                System.out.println();
                System.out.println("It's time for breakfast!\n"+
                "Илля предпочитает несколько варинатов завтрака.\n" + 
                "Каждый из них даёт какое-то количество ауры.\n"+
                "Выберите завтрак:\n"+
                "1 - Мюсли с Йогуртом\n"+
                "2 - Драники со сметаной\n"+
                "3 - Бутеры с чаем\n"+
                "4 - Не завтракать");
                int a1 = sc.nextInt();
                System.out.println();

                switch (a1)
                {
                    case 1:
                    {
                    aura+=250;
                    System.out.println("Илья захавал мюслей с йогуртом и остался довльным!\n"+
                    "Счётчик ауры:" + " "+aura);
                    break;
                    }
                    case 2:
                    {
                    aura+=500;
                    System.out.println("Илья съел драники и вошёл в поток!\n"+
                    "Бонус к ауре за патриотизм: +250 ауры!\n"+
                    "Счётчик ауры:" + " "+aura);
                    break;
                    }
                    case 3:
                    {
                        aura+=100;
                        System.out.println("База. Дёшево и сердитор!\n"+
                        "Счётчик ауры:" + " "+aura);
                        break;
                    }
                    case 4:
                    {
                        aura+=0;
                        System.out.println("Илья ничего не поел. Не критично, но может иметь последствия!\n"+
                        "Счётчик ауры:" + " "+aura);
                        break;
                    }
                }

                System.out.println ("После плотнейшего завтрака Илля летит приводить себя в порядок.\n"+
                "Водные процедуры?\n"+
                "1 - Да\n"+
                "2 - Нет\n");

                int a2 = sc.nextInt();
                System.out.println();

                switch(a2)
                {
                    case 1:
                    {
                    aura+=150;
                    System.out.println("Looking Fresh and Young!\n"+
                    "Счётчик ауры:" + " "+aura);
                    break;
                    }
                    case 2:
                    {
                       aura-=150;
                       System.out.println("Соскуфился!\n"+
                       "Счётчик ауры:" + " "+aura);
                       break;
                    } 
                }

                System.out.println();
                System.out.println("Время 5 утра, а Илья уже готов врываться.\n"+
                "Ещё довольно рано, поэтому нужно чем-то занять себя дома.\n"+
                "Выберите активность:\n"+
                "1 - Написать пост для 'Dime'\n"+
                "2 - Посмотреть хайлайты F1\n"+
                "3 - Заняться учёбой\n");
                int a4 = sc.nextInt();         
     
                switch (a4)
                {
                    case 1: 
                    {
                        
                        String post = sc.nextLine();
                        System.out.println();
                        System.out.println(post);
                        System.out.println();
                        aura+=1000;
                        System.out.println("Илья успешно написал пост!\n"+
                        "Счётчик ауры:"+" "+aura);
                        break;
                    }
                    case 2:
                    {
                        aura-=500;
                        System.out.println("Норрис опять не выиграл :( \n)"+
                        "Счётчик ауры:"+" "+aura);
                        break;
                    }
                    case 3:
                    {
                        aura+=700;
                        System.out.println("Унизил физику!\n"+
                        "Счётчик ауры:"+" "+aura);
                        break;
                    }
                }
                
                System.out.println("Теперь пора разваливать кабинеты в унике!.\n");
                System.out.println("Сэр Юрченко всегда должен быть на дрипе, поэтому в вовпросе обуви перед ним есть выбор.\n"+
                "Выберите обувь на сегодня:\n"+
                "1 - Jordan 11 \n"+
                "2 - Converse (грязные)\n");

                int a5 = sc.nextInt();
                 System.out.println();

                switch (a5)
                {
                    case 1:
                    {
                    aura+=500;
                    System.out.println("Дрип имеется! \n"+
                    "Счётчик ауры:" +" "+aura);
                    break;
                    }

                    case 2:
                    {
                        aura+=100;
                        System.out.println("Так называемыфй свэг Ильи. НЕ ДЛЯ ВСЕХ!\n"+
                        "Счётчик ауры:"+" "+aura);
                        break;
                    }
                }

                System.out.println("Сегодня довольно чилл день, поэтому у Ильи только 1 парa.\n");
                System.out.println();
                System.out.println("Илья пулл апается в класс.\n"+
                "Одногруппница оценила его аутфит!");
                aura+=1200;
                System.out.println("Счётчик ауры:"+" "+aura);
                System.out.println();
                System.out.println("Прошло 40 минут пары");
                 
                if (a1==4)
                {
                    aura-=2000;
                    System.out.println("Сказалось отсутсвие завтрака.\n"+
                    "У Ильи заурчал живот, который все услышали.\n"+
                    "Cчётчик ауры:"+ " "+aura);
                }
                else{
                    System.out.println("Илля отучился и уничтожил");
                }
                System.out.println();
                System.out.println("Пара успешно закончилась, а это значит, что пора домой");
                aura+=350;
                System.out.println("Счётчик ауры:"+" "+aura);

                System.out.println();
                System.out.println("Мы дома!");

                System.out.println();
                System.out.println("После плотнейшего обеда нужно отдохнуть.\n"+
                "Выберите занятие для Ильи:\n"+
                "1 - Посмотреть F1\n"+
                "2 - Поиграть в компик\n"+
                "3 - Попить пива\n");

                int a6 = sc.nextInt();

                switch (a6)
                {
                    case 1:
                    {
                    aura-=600;
                    System.out.println("Норрис снова второй.\n"+
                    "Счётчик ауры:"+" "+aura);
                    break;
                    }
                    case 2:
                    {
                        aura+=300;
                        System.out.println("Хотя бы тут Норрис первый.\n"+
                        "Счётчика ауры:"+" "+aura);
                        break;
                    }
                    case 3:
                    {
                        aura+=400;
                        System.out.println("С кайфом есть же.\n"+
                        "Счётчик ауры:"+" "+aura);
                        break;
                    }

                }

                System.out.println();
                System.out.println("Пора спать и подводить итоги дня!");
                System.out.println("Итоговое количество ауры:"+" "+aura);
                System.out.println();
                System.out.println("I wanna be like Ilya!");


                break;
            }
            case 2:
            {
                aura-=1000;
                System.out.println("Илья кинул будильник в чс и лёг спать дальше\n" +
                "Счётчик ауры:"+" "+aura);
                System.out.println();
                System.out.println("На часах 11:37. Довольно поздно для Ильи");
                System.out.println("It's time for breakfast!\n"+
                "Илля предпочитает несколько варинатов завтрака.\n" + 
                "Каждый из них даёт какое-то количество ауры.\n"+
                "Выберите завтрак:\n"+
                "1 - Мюсли с Йогуртом\n"+
                "2 - Драники со сметаной\n"+
                "3 - Бутеры с чаем\n"+
                "4 - Не завтракать");
                int a2 = sc.nextInt();
                System.out.println();

                switch (a2)
                {
                    case 1:
                    {
                    aura+=250;
                    System.out.println("Илья захавал мюслей с йогуртом и остался довльным!\n"+
                    "Счётчик ауры:" + " "+aura);
                    break;
                    }
                    case 2:
                    {
                    aura+=500;
                    System.out.println("Илья съел драники и вошёл в поток!\n"+
                    "Бонус к ауре за патриотизм: +250 ауры!\n"+
                    "Счётчик ауры:" + " "+aura);
                    break;
                    }
                    case 3:
                    {
                        aura+=100;
                        System.out.println("База. Дёшево и сердитор!\n"+
                        "Счётчик ауры:" + " "+aura);
                        break;
                    }
                    case 4:
                    {
                        aura+=0;
                        System.out.println("Илья ничего не поел. Не критично, но может иметь последствия!\n"+
                        "Счётчик ауры:" + " "+aura);
                        break;
                    }
                } 

                System.out.println ("После плотнейшего завтрака Илля летит приводить себя в порядок.\n"+
                "Водные процедуры?\n"+
                "1 - Да\n"+
                "2 - Нет\n");

                int a3 = sc.nextInt();
                System.out.println();

                switch(a3)
                {
                    case 1:
                    {
                    aura+=150;
                    System.out.println("Looking Frsh and Young!\n"+
                    "Счётчик ауры:" + " "+aura);
                    break;
                    }
                    case 2:
                    {
                       aura-=150;
                       System.out.println("Соскуфился!\n"+
                       "Счётчик ауры:" + " "+aura);
                       break;
                    } 
                }

                System.out.println("Так как Илья проснулся довольно поздно, то пора сразу выдвигаться в уник.\n");
                System.out.println("Сэр Юрченко всегда должен быть на дрипе, поэтому в вовпросе обуви перед ним есть выбор.\n"+
                "Выберите обувь на сегодня:\n"+
                "1 - Jordan 11 \n"+
                "2 - Converse (грязные)\n");
                 int a4 = sc.nextInt();
                 System.out.println();

                switch (a4)
                {
                    case 1:
                    {
                    aura+=500;
                    System.out.println("Дрип имеется! \n"+
                    "Счётчик ауры:" +" "+aura);
                    break;
                    }

                    case 2:
                    {
                        aura+=100;
                        System.out.println("Так называемыфй свэг Ильи. НЕ ДЛЯ ВСЕХ!\n"+
                        "Счётчик ауры:"+" "+aura);
                        break;
                    }
                }

                System.out.println("Сегодня довольно чилл день, поэтому у Ильи только 1 парa.\n");
                System.out.println();
                System.out.println("Илья пулл апается в класс.\n"+
                "Одногруппница оценила его аутфит!");
                aura+=1200;
                System.out.println("Счётчик ауры:"+" "+aura);
                System.out.println();
                System.out.println("Прошло 40 минут пары");
                 
                if (a2==4)
                {
                    aura-=2000;
                    System.out.println("Сказалось отсутсвие завтрака.\n"+
                    "У Ильи заурчал живот, который все услышали.\n"+
                    "Cчётчик ауры:"+ " "+aura);
                }
                else{
                    System.out.println("Илля отучился и уничтожил");
                }
                System.out.println();
                System.out.println("Пара успешно закончилась, а это значит, что пора домой");
                aura+=350;
                System.out.println("Счётчик ауры:"+" "+aura);

                System.out.println();
                System.out.println("Мы дома!");

                System.out.println();
                System.out.println("После плотнейшего обеда нужно отдохнуть.\n"+
                "Выберите занятие для Ильи:\n"+
                "1 - Посмотреть F1\n"+
                "2 - Поиграть в компик\n"+
                "3 - Попить пива\n");

                int a6 = sc.nextInt();

                switch (a6)
                {
                    case 1:
                    {
                    aura-=600;
                    System.out.println("Норрис снова второй.\n"+
                    "Счётчик ауры:"+" "+aura);
                    break;
                    }
                    case 2:
                    {
                        aura+=300;
                        System.out.println("Хотя бы тут Норрис первый.\n"+
                        "Счётчика ауры:"+" "+aura);
                        break;
                    }
                    case 3:
                    {
                        aura+=400;
                        System.out.println("С кайфом есть же.\n"+
                        "Счётчик ауры:"+" "+aura);
                        break;
                    }

                }

                System.out.println();
                System.out.println("Пора спать и подводить итоги дня!");
                System.out.println("Итоговое количество ауры:"+" "+aura);
                System.out.println();
                System.out.println("I wanna be like Ilya!");


            break; 
        }
    }
}
}