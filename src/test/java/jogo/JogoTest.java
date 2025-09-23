package jogo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class JogoTest {
    @Test
    public void vitoriaPrimeiroTurnoSoma7() {
        Dado mockDado1 = mock(Dado.class);
        when(mockDado1.numero()).thenReturn(4);

        Dado mockDado2 = mock(Dado.class);
        when(mockDado1.numero()).thenReturn(3);

        Jogador mockJogador = mock(Jogador.class);
        when(mockJogador.lancar(mockDado1, mockDado2)).thenReturn(7);

        Jogo jogo = new Jogo();
        boolean vitoria = jogo.jogo(mockJogador, mockDado1, mockDado2);

        Assertions.assertEquals(true, vitoria);
    }

    @Test
    public void vitoriaPrimeiroTurnoSoma11() {
        Dado mockDado1 = mock(Dado.class);
        when(mockDado1.numero()).thenReturn(5);

        Dado mockDado2 = mock(Dado.class);
        when(mockDado1.numero()).thenReturn(6);

        Jogador mockJogador = mock(Jogador.class);
        when(mockJogador.lancar(mockDado1, mockDado2)).thenReturn(11);

        Jogo jogo = new Jogo();
        boolean vitoria = jogo.jogo(mockJogador, mockDado1, mockDado2);

        Assertions.assertEquals(true, vitoria);
    }

    @Test
    public void derrotaPrimeiroTurnoSoma2() {
        Dado mockDado1 = mock(Dado.class);
        when(mockDado1.numero()).thenReturn(1);

        Dado mockDado2 = mock(Dado.class);
        when(mockDado1.numero()).thenReturn(1);

        Jogador mockJogador = mock(Jogador.class);
        when(mockJogador.lancar(mockDado1, mockDado2)).thenReturn(2);

        Jogo jogo = new Jogo();
        boolean derrota = jogo.jogo(mockJogador, mockDado1, mockDado2);

        Assertions.assertEquals(false, derrota);
    }

    @Test
    public void derrotaPrimeiroTurnoSoma3() {
        Dado mockDado1 = mock(Dado.class);
        when(mockDado1.numero()).thenReturn(2);

        Dado mockDado2 = mock(Dado.class);
        when(mockDado1.numero()).thenReturn(1);

        Jogador mockJogador = mock(Jogador.class);
        when(mockJogador.lancar(mockDado1, mockDado2)).thenReturn(3);

        Jogo jogo = new Jogo();
        boolean derrota = jogo.jogo(mockJogador, mockDado1, mockDado2);

        Assertions.assertEquals(false, derrota);
    }

    @Test
    public void derrotaPrimeiroTurnoSoma12() {
        Dado mockDado1 = mock(Dado.class);
        when(mockDado1.numero()).thenReturn(6);

        Dado mockDado2 = mock(Dado.class);
        when(mockDado1.numero()).thenReturn(6);

        Jogador mockJogador = mock(Jogador.class);
        when(mockJogador.lancar(mockDado1, mockDado2)).thenReturn(12);

        Jogo jogo = new Jogo();
        boolean derrota = jogo.jogo(mockJogador, mockDado1, mockDado2);

        Assertions.assertEquals(false, derrota);
    }

    @Test
    public void derrotaSegundoTurno() {
        Dado mockDado1 = mock(Dado.class);
        when(mockDado1.numero()).thenReturn(2, 3);

        Dado mockDado2 = mock(Dado.class);
        when(mockDado1.numero()).thenReturn(2, 4);

        Jogador mockJogador = mock(Jogador.class);
        when(mockJogador.lancar(mockDado1, mockDado2)).thenReturn(4, 7);

        Jogo jogo = new Jogo();
        boolean derrota = jogo.jogo(mockJogador, mockDado1, mockDado2);

        Assertions.assertEquals(false, derrota);
    }

    @Test
    public void vitoriaTerceiroTurno() {
        Dado mockDado1 = mock(Dado.class);
        when(mockDado1.numero()).thenReturn(2, 4, 2);

        Dado mockDado2 = mock(Dado.class);
        when(mockDado1.numero()).thenReturn(2, 4, 2);

        Jogador mockJogador = mock(Jogador.class);
        when(mockJogador.lancar(mockDado1, mockDado2)).thenReturn(4, 8, 4);

        Jogo jogo = new Jogo();
        boolean vitoria = jogo.jogo(mockJogador, mockDado1, mockDado2);

        Assertions.assertEquals(true, vitoria);
    }

    @Test
    public void derrotaTerceiroTurno() {
        Dado mockDado1 = mock(Dado.class);
        when(mockDado1.numero()).thenReturn(2, 4, 4);

        Dado mockDado2 = mock(Dado.class);
        when(mockDado1.numero()).thenReturn(2, 4, 3);

        Jogador mockJogador = mock(Jogador.class);
        when(mockJogador.lancar(mockDado1, mockDado2)).thenReturn(4, 8, 7);

        Jogo jogo = new Jogo();
        boolean derrota = jogo.jogo(mockJogador, mockDado1, mockDado2);

        Assertions.assertEquals(false, derrota);
    }
}
