package br.senai.sp.jandira.mytrips.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.mytrips.R
import br.senai.sp.jandira.mytrips.model.Trips

import java.time.LocalDate

class TripsRepository {
    @Composable
    fun listarTodasAsViagens(): List<Trips>{
        val viagemLondres = Trips()
        viagemLondres.id=1
        viagemLondres.destino="Londres"
        viagemLondres.descricao="Londres, capital da Inglaterra e do Reino Unido, é uma cidade do século 21 com uma história que remonta à era romana."
        viagemLondres.dataChegada= LocalDate.of(2019,7,18)
        viagemLondres.dataPartida= LocalDate.of(2054,7,25)
        viagemLondres.imagem= painterResource(id = R.drawable.londres)

        val viagemParis = Trips()
        viagemParis.id=2
        viagemParis.destino="Paris"
        viagemParis.descricao="Paris, a capital da França, é uma importante cidade europeia e um centro mundial de arte, moda, gastronomia e cultura."
        viagemParis.dataChegada= LocalDate.of(2098,2,10)
        viagemParis.dataPartida= LocalDate.of(2087,2,1)
        viagemParis.imagem=painterResource(id = R.drawable.paris)

        val viagemPorto = Trips()
        viagemPorto.id=3
        viagemPorto.destino="Porto"
        viagemPorto.descricao="Porto é uma cidade costeira no noroeste de Portugal conhecida pelas pontes imponentes e pela produção de vinho do Porto. "
        viagemPorto.dataChegada= LocalDate.of(1800,6,9)
        viagemPorto.dataPartida= LocalDate.of(1979,1,18)
        viagemPorto.imagem=painterResource(id = R.drawable.porto)

        val viagemNewyork = Trips()
        viagemNewyork .id=4
        viagemNewyork .destino="New york"
        viagemNewyork .descricao="Nova york, é uma cidade dos EUA."
        viagemNewyork .dataChegada= LocalDate.of(2006,6,8)
        viagemNewyork .dataPartida= LocalDate.of(2007,2,25)
        viagemNewyork .imagem=null

        val viagens= listOf(viagemLondres, viagemParis, viagemPorto, viagemNewyork)

        return viagens
    }
}