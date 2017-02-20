package mvvm.bios.ua.recyclerviewdatabinding.model;

import java.util.ArrayList;

/**
 * Created by BIOS on 2/19/2017.
 */

public class Content {
    private String title;
    private String urlImagePreview;

    public Content(){}

    public Content(String title, String urlImagePreview){
        this.title = title;
        this.urlImagePreview = urlImagePreview;

    }

    public String getTitle() {
        return title;
    }

    public String getUrlImagePreview() {
        return urlImagePreview;
    }

    public ArrayList<Content> getPageContent(){
        ArrayList<Content> contents = new ArrayList<>();
        contents.add(new Content("Меня зовут Бай Сяофэй / Wo Jiao Bai Xiaofei [1-11 из 39]","http://animevost.org/uploads/posts/2017-01/1484859292_1.jpg"));
        contents.add(new Content("Список нечисти / Yaoguai Mingdan [1-16 из 18]","http://animevost.org/uploads/posts/2017-02/1486216528_1.jpg"));
        contents.add(new Content("Габриэль бросает школу  / Gabriel Dropout [1-7 из 12]","http://animevost.org/uploads/posts/2016-12/1482930633_1.jpg"));
        contents.add(new Content("Гинтама (пятый сезон) / Gintama (2017) [1-7 из 12+]","http://animevost.org/uploads/posts/2017-01/1483648806_1.jpg"));
        contents.add(new Content("Истории охотников за монстрами / Monster Hunter Stories Ride On [1-20 из 48]","http://animevost.org/uploads/posts/2016-10/1477739804_1.jpg"));
        contents.add(new Content("Драконий дантист / Ryuu no Haisha [1 из 2] [2 серия - 26 февраля]","http://animevost.org/uploads/posts/2017-02/1487532255_1.jpg"));
        contents.add(new Content("Проблемы идола / Idol Jihen [1-7 из 12+]","http://animevost.org/uploads/posts/2017-01/1484498501_problemy_idola.jpg"));
        contents.add(new Content("Академия ведьмочек (ТВ) / Little Witch Academia (TV) [1-7 из 12+] [8 серия - 26 февраля] [9 - 5 марта] [10 - 12 марта]","http://animevost.org/uploads/posts/2016-12/1482872531_akademia_vedmochek.jpg"));
        contents.add(new Content("Кошачьи дни / Nyanko Days [1-7 из 12+]","http://animevost.org/uploads/posts/2017-01/1484498572_koshachi_dni.jpg"));
        contents.add(new Content("Ура мечте! / Bang Dream! [1-5 из 25]","http://animevost.org/uploads/posts/2017-02/1485955250_1.jpg"));
        contents.add(new Content("Эльдрайв / Eldlive [1-7 из 12+]","http://animevost.org/uploads/posts/2016-12/1482872596_el_drayv.jpg"));
        contents.add(new Content("Сказания Зестирии (второй сезон) / Tales of Zestiria: The X Second Season [1-7 из 12+] [8 серия - 26 февраля] [9 - 5 марта] [10 - 12 марта]","http://animevost.org/uploads/posts/2016-12/1482580293_1.jpg"));
        contents.add(new Content("Мобильный воин ГАНДАМ: Железнокровные сироты (второй сезон) / Kidou Senshi Gundam: Tekketsu no Orphans 2nd Season [1-19 из 25]","http://animevost.org/uploads/posts/2016-10/1475532655_1.jpg"));
        contents.add(new Content("Драгонболл Супер / Dragon Ball Super [1-79 из 100+]","http://animevost.org/uploads/posts/2015-07/1436341927_1.jpg"));
        contents.add(new Content("Ван Пис / One Piece [1-777 из 900+] [778 серия - 26 февраля] [779 - 5 марта] [780 - 12 марта]","http://animevost.org/uploads/posts/2015-06/1435064845_van_pis.jpg"));
        contents.add(new Content("Тигровая маска / Tiger Mask W [1-19 из 39]","http://animevost.org/uploads/posts/2016-10/1475532788_1.jpg"));
        contents.add(new Content("Дэми-тян хочет рассказать / Demi-chan wa Kataritai [1-7 из 12+]","http://animevost.org/uploads/posts/2017-01/1484421425_1.jpg"));
        contents.add(new Content("Мартовский лев / 3-gatsu no Lion [1-18 из 22]","http://animevost.org/uploads/posts/2017-01/1485022564_1.jpg"));
        contents.add(new Content("Перезапись (второй сезон) / Rewrite: Moon and Terra [1-6 из 12+] [7 серия - 25 февраля] [8 - 4 марта] [7 - 11 марта]","http://animevost.org/uploads/posts/2017-01/1484498574_perezapis_2.jpg"));
        contents.add(new Content("Сёва-Гэнроку: Двойное самоубийство по ракуго (второй сезон) / Shouwa Genroku Rakugo Shinjuu: Sukeroku Futatabi-hen [1-7 из 12+]","http://animevost.org/uploads/posts/2017-01/1484445937_1.jpg"));
        contents.add(new Content("Классикалоиды / Classicaloid [1-19 из 25]","http://animevost.org/uploads/posts/2016-10/1476269283_1.jpg"));
        contents.add(new Content("Школьницы в ударе / Schoolgirl Strikers: Animation Channel [1-7 из 12+]","http://animevost.org/uploads/posts/2017-01/1484498685_shkolnitsy_v_udare.jpg"));
        contents.add(new Content("Синий Экзорцист (второй сезон) / Ao no Exorcist: Kyoto Fujouou-hen [1-7 из 12+] [8 серия - 24 февраля] [9 - 3 марта] [10 - 10 марта]","http://animevost.org/uploads/posts/2016-12/1482251911_1.jpg"));
        contents.add(new Content("Девичий велоклуб Минами Камакуры / Minami Kamakura Koukou Joshi Jitensha Bu [1-7 из 12+]","http://animevost.org/uploads/posts/2017-01/1484332930_1.jpg"));
        contents.add(new Content("Фуука / Fuuka [1-8 из 12+] [9 серия - 24 февраля] [10 - 3 марта] [11 - 10 марта]","http://animevost.org/uploads/posts/2016-12/1482935395_1.jpg"));
        contents.add(new Content("Военная хроника маленькой девочки / Youjo Senki [1-6 из 12+] [7 серия - 24 февраля] [8 - 3 марта] [9 - 10 марта]","http://animevost.org/uploads/posts/2017-01/1483648846_1.jpg"));
        contents.add(new Content("Гора Священного меча: Банкет Звездной пыли (второй сезон) / Reikenzan: Eichi e no Shikaku [1-7 из 12+] [8 серия - 24 февраля] [9 - 3 марта] [10 - 10 марта]","http://animevost.org/uploads/posts/2016-12/1482529752_1.jpg"));
        contents.add(new Content("Город предсказательниц / Urara Meirochou [1-7 из 12+]","http://animevost.org/uploads/posts/2016-12/1482931042_1.jpg"));
        contents.add(new Content("Сирена / Seiren [1-7 из 12]","http://animevost.org/uploads/posts/2017-01/1483648563_xoresx4ociq.jpg"));
        contents.add(new Content("Квест Коро-сенсея! / Koro-sensei Quest! [1-9 из 12]","http://animevost.org/uploads/posts/2016-12/1483121087_gzcqrdlgo7c.jpg"));
        contents.add(new Content("Больше, чем возлюбленные (второй сезон) / Super Lovers Second Season [1-6 из 12+] [7 серия - 23 февраля] [8 - 2 марта] [9 - 9 марта]","http://animevost.org/uploads/posts/2016-12/1482580952_1.jpg"));
        contents.add(new Content("Изо всех сил! / All Out! [1-19 из 25] [20 серия - 23 февраля] [21 - 2 марта] [22 - 9 марта]","http://animevost.org/uploads/posts/2016-09/1475023908_1.jpg"));
        contents.add(new Content("Тайные желания отвергнутых / Kuzu no Honkai [1-6 из 12+] [7 серия - 23 февраля] [8 - 2 марта] [9 - 9 марта]","http://animevost.org/uploads/posts/2016-12/1481755487_1.jpg"));
        contents.add(new Content("Запредельная четверка / Marginal #4 Kiss Kara Tsukuru Big Bang [1-6 из 12+]","http://animevost.org/uploads/posts/2017-01/1485270886_1.jpg"));
        contents.add(new Content("Месть Масамунэ! / Masamune-kun no Revenge [1-7 из 12+] [8 серия - 23 февраля] [9 - 2 марта] [10 - 9 марта]","http://animevost.org/uploads/posts/2016-12/1482854750_1.jpg"));
        contents.add(new Content("Наруто Ураганные Хроники / Naruto Shippuuden [1-495 из 500+] [496 серия - 23 февраля] [497 - 2 марта] [498 - 9 марта]","http://animevost.org/uploads/posts/2016-06/1464842897_1.jpg"));
        contents.add(new Content("Мир в супер песочнице / Chou Yuu Sekai: Being the Reality [1-4 из 12+]","http://animevost.org/uploads/posts/2017-01/1484832631_1.jpg"));
        contents.add(new Content("Дитя хаоса  / Chaos;Child [0-6 из 12+] [7 серия - 22 февраля] [8 - 1 марта] [9 - 8 марта]","http://animevost.org/uploads/posts/2016-12/1482529214_1.jpg"));
        contents.add(new Content("Этот замечательный мир! (второй сезон) / Kono Subarashii Sekai ni Shukufuku wo! Second Season [1-6 из 12+] [7 серия - 22 февраля] [8 - 1 марта] [9 - 8 марта]","http://animevost.org/uploads/posts/2016-12/1482252515_1.jpg"));
        contents.add(new Content("Дунго Сяоцзе / Dongguo Xiaojie [1-8 из 20]","http://animevost.org/uploads/posts/2017-01/1483287339_ri1d5cfibgk.jpg"));
        contents.add(new Content("Из одной комнаты / One Room [1-6 из 12+]","http://animevost.org/uploads/posts/2017-01/1484223631_1.jpg"));
        contents.add(new Content("Дракон-горничная Кобаяши-сан / Kobayashi-san Chi no Maid Dragon [1-6 из 12+] [7 серия - 22 февраля] [8 - 1 марта] [9 - 8 марта]","http://animevost.org/uploads/posts/2017-01/1483648804_kobayashi-san.jpg"));
        contents.add(new Content("Вкусно! Моя итальянская кухня  / Piace: Watashi no Italian [1-6 из 12+]","http://animevost.org/uploads/posts/2016-12/1482930147_1.jpg"));
        contents.add(new Content("Падение Акибы / Akiba's Trip The Animation [1-7 из 12+]","http://animevost.org/uploads/posts/2017-01/1483648723_1.jpg"));
        contents.add(new Content("Две звезды Онмёджи / Sousei no Onmyouji [1-44 из 50+] [45 серия - 22 февраля] [46 - 1 марта] [47 - 8 марта]","http://animevost.org/uploads/posts/2016-03/1459213761_1.jpg"));
        contents.add(new Content("Намбака (второй сезон) / Nanbaka Second Season [1-7 из 12] [8 серия - 22 февраля] [9 - 1 марта] [10 - 8 марта]","http://animevost.org/uploads/posts/2017-01/1484083604_1.jpg"));
        contents.add(new Content("Таинственный китаец / Chinese Mystery Man [1-46 из 63]","http://animevost.org/uploads/posts/2017-01/1483625725_1.jpg"));
        contents.add(new Content("Пожимая руку / Hand Shakers [1-6 из 12+] [7 серия - 21 февраля] [8 - 28 февраля] [9 - 7 марта]","http://animevost.org/uploads/posts/2016-12/1482872457_1.jpg"));
        contents.add(new Content("АККА: 13-й отдел по наблюдению / ACCA 13-ku Kansatsu-ka [1-6 из 12+] [7 серия - 21 февраля] [8 - 28 февраля] [9 - 7 марта]","http://animevost.org/uploads/posts/2016-12/1481754990_1.jpg"));
        contents.add(new Content("Ниндзя Нобунаги / Nobunaga no Shinobi [1-20 из 24+]","http://animevost.org/uploads/posts/2016-09/1474636606_1.jpg"));
        return contents;
    }
}
