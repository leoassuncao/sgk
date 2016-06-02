package sgk.com.br.sgk.Provider;

import java.util.ArrayList;
import java.util.List;

import sgk.com.br.sgk.List.NewsList;
import sgk.com.br.sgk.R;

/**
 * Created by Leonardo Assunção on 28/05/2016.
 */
public class NewsProvider {

    public static List<NewsList> provideNewsList() {
        List<NewsList> news = new ArrayList();

        news.add(NewsProvider.setFirst());
        news.add(NewsProvider.setSecond());
        news.add(NewsProvider.setThird());
        news.add(NewsProvider.setFourth());
        return news;
    }

    private static NewsList setFirst() {
        NewsList first = new NewsList();
        first.setNews_title("3º Campeonato Brasiliense de Karate-Do (JKA) | 2016");
        first.setNews_photo(R.drawable.pic_first);
        first.setNews_details("A SGK abre as inscrições para o 3º Campeonato Brasiliense de Karate-do JKA. Acesse o link abaixo para comprar na plataformas de venda Sympla, aqui você pode até mesmo dividir a sua inscrição de modo rápido e fácil, acesse:");
        return first;
    }

    private static NewsList setSecond() {
        NewsList second = new NewsList();
        second.setNews_title("Parabéns Sensei Tiago França | Aprovado no exame para o 4º Dan (JKA)");
        second.setNews_photo(R.drawable.pic_second);
        second.setNews_details("Sábado, 2 de maio de 2015, nosso Instrutor Chefe da SGK: Sensei Tiago Porto França foi aprovado para o 4º Dan pela JKA. O exame contou com a avaliação de Sensei Yochizo Machida (7ºDan/JKA) e Sensei Takenori Imura (8ºDan/JKA). Sensei Imura é Vice Gerente-Geral da Divisão Técnica da JKA no Japão e Membro do Conselho de Mestres(Shihankai Committee)."
                );
        return second;
    }

    private static NewsList setThird() {
        NewsList third = new NewsList();
        third.setNews_title("2º Campeonato Brasiliense de Karate-Do (JKA) | 2015");
        third.setNews_photo(R.drawable.pic_third);
        third.setNews_details("A SGK organizou, no dia 28 de março de 2015, o 2º Campeonato Brasiliense de Karate-do JKA. Parabéns aos karatekas que participaram do campeonato, sua dedicação fez pelo esforço tornaram o evento um sucesso. Clique aqui para acessar as fotos do evento."
                );
        return third;
    }

    private static NewsList setFourth() {
        NewsList fourth = new NewsList();
        fourth.setNews_title("XV Campeonato Brasileiro JKA - 2014 | Sara Mauá");
        fourth.setNews_photo(R.drawable.pic_fourth);
        fourth.setNews_details("Parabéns à atleta da SGK Sara Mauá!! Sara foi campeã em Kata Individual e Kumite Individual em sua categoria (Juvenil Feminino – 19 a 21 anos)."
                );
        return fourth;
    }
}
