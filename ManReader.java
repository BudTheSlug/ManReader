import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import javax.sound.sampled.*;
import java.lang.Character;

public class ManifestoReader {

	public static void main(String[] args) throws IOException {
        // replace this with a known encoding if possible

        Charset encoding = Charset.forName("UTF-8");
{
            File file = new File("C:\\\\JavaFiles\\i.txt");
            handleFile(file, encoding);
        }
    }

    private static void handleFile(File file, Charset encoding)
            throws IOException {
        try (InputStream in = new FileInputStream(file);
             Reader reader = new InputStreamReader(in, encoding);
             // buffer for efficiency
            Reader buffer = new BufferedReader(reader)) {
            handleCharacters(buffer);
        }
        
        catch (IOException e) {
        	System.out.println(e.getMessage() );
        }
    }

    private static void handleCharacters(Reader reader)
            throws IOException {
        int r;
        while ((r = reader.read()) != -1) {
            char ch = (char) r;
            System.out.print(/*"Do something with " +*/ ch);
            String check, Z, Q, J, A, B, C, D, E, F, G, H, I, K, L, M, N, O, P, R, S, T, U, V, W, X, Y, Period, Comma, Apostrophe, Quote, QuestionMark, ExclamationPoint, Space;
            Z = ("z");
            Q = ("q");
            J = ("j");
            A = ("a");
            B = ("b");
            C = ("c");
            D = ("d");
            E = ("e");
            F = ("f");
            G = ("g");
            H = ("h");
            I = ("i");
            K = ("k");
            L = ("l");
            M = ("m");
            N = ("n");
            O = ("o");
            P = ("p");
            R = ("r");
            S = ("s");
            T = ("t");
            U = ("u");
            V = ("v");
            W = ("w");
            X = ("x");
            Y = ("y");
            Period = (".");
            Comma = (",");
            Apostrophe = ("'");
            Quote = ("\"");
            QuestionMark = ("?");
            ExclamationPoint = ("!");
            Space = (" ");
            check = Character.toString(ch);
            if (check.equals(Z)) {
            	File file2 = new File("C:\\\\JavaFiles\\23.Squire_BassC1.wav");
                play(file2);
                
            }
            if (check.equals(Q)) {
            	File file2 = new File("C:\\\\JavaFiles\\24.Squire_BassD1.wav");
                play(file2);
            }
            if (check.equals(J)) {
            	File file2 = new File("C:\\\\JavaFiles\\13.Epiphone_AcousticEb0.wav");
                play(file2);
            }
            if (check.equals(A)) {
            	File file2 = new File("C:\\\\JavaFiles\\12.Epiphone_AcousticD0.wav");
                play(file2);
            }
            if (check.equals(B)) {
            	File file2 = new File("C:\\\\JavaFiles\\27.Squire_BassC0.wav");
                play(file2);
            }
            if (check.equals(C)) {
            	File file2 = new File("C:\\\\JavaFiles\\35.Epiphone_ElectricC0.wav");
                play(file2);
            }
            if (check.equals(D)) {
            	File file2 = new File("C:\\\\JavaFiles\\8.Epiphone_AcousticD1.wav");
                play(file2);
            }
            if (check.equals(E)) {
            	File file2 = new File("C:\\\\JavaFiles\\42.Kentucky_MandoG0.wav");
                play(file2);
                //System.out.print(/*"Do something with " +*/ "01100101");
            }
            if (check.equals(F)) {
            	File file2 = new File("C:\\\\JavaFiles\\26.Squire_BassG0.wav");
                play(file2);
            }
            if (check.equals(G)) {
            	File file2 = new File("C:\\\\JavaFiles\\36.Epiphone_ElectricD0.wav");
                play(file2);
            }
            if (check.equals(H)) {
            	File file2 = new File("C:\\\\JavaFiles\\6.Epiphone_AcousticG1.wav");
                play(file2);
            }
            if (check.equals(I)) {
            	File file2 = new File("C:\\\\JavaFiles\\44.Kentucky_MandoD0.wav");
                play(file2);
            }
            if (check.equals(K)) {
            	File file2 = new File("C:\\\\JavaFiles\\28.Squire_BassD0.wav");
                play(file2);
            }
            if (check.equals(L)) {
            	File file2 = new File("C:\\\\JavaFiles\\11.Epiphone_AcousticC0.wav");
                play(file2);
            }
            if (check.equals(M)) {
            	File file2 = new File("C:\\\\JavaFiles\\7.Epiphone_AcousticC1.wav");
                play(file2);
            }
            if (check.equals(N)) {
            	File file2 = new File("C:\\\\JavaFiles\\40.Kentucky_MandoD1.wav");
                play(file2);
            }
            if (check.equals(O)) {
            	File file2 = new File("C:\\\\JavaFiles\\39.Kentucky_MandoC1.wav");
                play(file2);
            }
            if (check.equals(P)) {
            	File file2 = new File("C:\\\\JavaFiles\\31.Epiphone_ElectricC1.wav");
                play(file2);
            }
            if (check.equals(S)) {
            	File file2 = new File("C:\\\\JavaFiles\\38.Kentucky_MandoG1.wav");
                play(file2);
            }
            if (check.equals(R)) {
            	File file2 = new File("C:\\\\JavaFiles\\10.Epiphone_AcousticG0.wav");
                play(file2);
            }
            if (check.equals(T)) {
            	File file2 = new File("C:\\\\JavaFiles\\43.Kentucky_MandoC0.wav");
                play(file2);
            }
            if (check.equals(U)) {
            	File file2 = new File("C:\\\\JavaFiles\\34.Epiphone_ElectricG0.wav");
                play(file2);
            }
            if (check.equals(V)) {
            	File file2 = new File("C:\\\\JavaFiles\\45.Kentucky_MandoEb0.wav");
                play(file2);
            }
            if (check.equals(W)) {
            	File file2 = new File("C:\\\\JavaFiles\\32.Epiphone_ElectricD1.wav");
                play(file2);
            }
            if (check.equals(X)) {
            	File file2 = new File("C:\\\\JavaFiles\\22.Squire_BassG1.wav");
                play(file2);
            }
            if (check.equals(Y)) {
            	File file2 = new File("C:\\\\JavaFiles\\30.Epiphone_ElectricG1.wav");
                play(file2);
            }
            if (check.equals(Period)) {
            	File file2 = new File("C:\\\\JavaFiles\\41.Kentucky_MandoEb1.wav");
                play(file2);
            }
            if (check.equals(Comma)) {
            	File file2 = new File("C:\\\\JavaFiles\\9.Epiphone_AcousticEb1.wav");
                play(file2);
            }
            if (check.equals(Quote)) {
            	File file2 = new File("C:\\\\JavaFiles\\29.Squire_BassEb0.wav");
                play(file2);
            }
            if (check.equals(Apostrophe)) {
            	File file2 = new File("C:\\\\JavaFiles\\37.Epiphone_ElectricEb0.wav");
                play(file2);
            }
            if (check.equals(QuestionMark)) {
            	File file2 = new File("C:\\\\JavaFiles\\33.Epiphone_ElectricEb1.wav");
                play(file2);
            }
            if (check.equals(ExclamationPoint)) {
            	File file2 = new File("C:\\\\JavaFiles\\25.Squire_BassEb1.wav");
                play(file2);
            }
          /*  if (check.equals(Space)) {
            	File file2 = new File("C:\\\\JavaFiles\\Quiet.wav");
                play(file2);
            }*/
        }
    }
   
    public static void play(File file2) 
    {
        try
        {
            final Clip clip = (Clip)AudioSystem.getLine(new Line.Info(Clip.class));

            clip.addLineListener(new LineListener()
            {
                @Override
                public void update(LineEvent event)
                {
                    if (event.getType() == LineEvent.Type.STOP)
                        clip.close();
                }
            });

            clip.open(AudioSystem.getAudioInputStream(file2));
            clip.start();
            while (!clip.isRunning())
                Thread.sleep(1);
            while (clip.isRunning())
              Thread.sleep(1);
            //clip.close();
        }
        catch (Exception exc)
        {
            exc.printStackTrace(System.out);
        }
    }  

}
