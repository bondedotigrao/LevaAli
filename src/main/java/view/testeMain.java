package view;

import model.Implementacoes.CorridaHibernate;
import model.Implementacoes.MotoHibernate;
import model.Implementacoes.PassageiroHibernate;
import model.Implementacoes.PilotoHibernate;
import java.util.Date;
import model.Corrida;
import model.Moto;
import model.Passageiro;
import model.Piloto;

public class testeMain {

    public static void main(String args[]) {

        MotoHibernate motoH = new MotoHibernate();
        Moto moto = new Moto("arroz", "Biz", "Rosa");
        //   motoH.cadastrar(moto);

        PilotoHibernate pilotoH = new PilotoHibernate();
        Piloto piloto = new Piloto("Arnaldo", "54022", "jupi", new Date(), "ocupado", moto);
        //    pilotoH.cadastrar(piloto);
//                         
//             
        PassageiroHibernate passageiroH = new PassageiroHibernate();
        Passageiro p;
        Passageiro passageiro = new Passageiro("gdfgd","er","vcxvxvxv");
//        passageiroH.cadastrar(passageiro);
//        p = passageiroH.recuperar(5);
//        passageiroH.deletar(p);



        CorridaHibernate CorridaH = new CorridaHibernate();
        Corrida corrida = new Corrida(passageiro, piloto, moto, 5);
          CorridaH.cadastrar(corrida);   

    }
}
