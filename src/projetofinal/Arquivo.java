package projetofinal;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import javax.swing.JOptionPane;

public class Arquivo {

	public static void leitor(String path) throws IOException {
			BufferedReader buffRead = new BufferedReader(new FileReader(path));
			String linha = "";
			while (true) {
				if (linha != null) {
					System.out.println(linha);

				} else
					break;
				linha = buffRead.readLine();
			}
			buffRead.close();
		}

		public static void escritor(String path) throws IOException {
		int i;
		    try (BufferedWriter escritor = new BufferedWriter(new FileWriter(path))) {
				do
				 {
				 String menu= JOptionPane.showInputDialog("CADASTRO PROJETO SOCIAL"
				 		+ "\n1-Inserir Dados do Projeto:\n2-Inserir Novos Eventos do Projeto\n3-Sair");
				 i = Integer.parseInt(menu);
				 
				 switch (i)
				    {
				         case 1:
				            String titulo= JOptionPane.showInputDialog("Digite o T�tulo do Projeto: ");
				            String objetivo= JOptionPane.showInputDialog("Digite o Objetivo: ");
				            String endereco= JOptionPane.showInputDialog("Digite o Endere�o do Projeto: ");
				            String datames= JOptionPane.showInputDialog("Digite o M�s de �ncio: (Informe o m�s por n�mero, exemplo: Janeiro = 01; Fevereiro = 02...)");
				            String datadia= JOptionPane.showInputDialog("Digite apenas o Dia de �ncio: ");
				            String status= JOptionPane.showInputDialog("Informe o Status do Projeto: ");
				            String descricao= JOptionPane.showInputDialog("Informe a Descri��o do Pr�ximo Evento: ");
				            String agendames= JOptionPane.showInputDialog("Informe o m�s do Pr�ximo Evento: ");
				            String agendadia= JOptionPane.showInputDialog("Informe apenas o dia do M�s do Pr�ximo Evento: ");
				            String hora= JOptionPane.showInputDialog("Informe a hora do Projeto: ");
				            String status2= JOptionPane.showInputDialog("Informe o Status de Evento (Executado; Paralisado; Em Execu��o): ");
				            escritor.append("Projeto Social: \n"+"\n T�tulo do Projeto: "+titulo
				            		+"\n Obejetivo do Projeto: "+objetivo+
				            		"\n Endere�o do Projeto: "+endereco+
				            		"\n Data de �nicio do Projeto: "+datadia+"/"+datames+
				            		"\nStatus do Projeto Social: "+status+
				            		"\n\n ____________________________________\n\n Informa��es sobre agenda: "+
				            "\nDescri��o do Pr�ximo Evento do Projeto Social: "+descricao+
				            "\n Data do Pr�ximo Evento : "+agendadia+"/"+agendames+
				            "\n Hora do pr�ximo Evento: "+hora+
				            "\n Status do Evento: "+status2);
				            JOptionPane.showMessageDialog(null, "Inserido com Sucesso");
				             break;
				         case 2:
				        	 String titulo2= JOptionPane.showInputDialog("Digite o T�tulo do Projeto que deseja adicionar dados a agenda : ");
				        	 String descricao2= JOptionPane.showInputDialog("Informe a Descri��o do Pr�ximo Evento: ");
					         String agendames2= JOptionPane.showInputDialog("Informe o m�s do Pr�ximo Evento: ");
					         String agendadia2= JOptionPane.showInputDialog("Informe apenas o dia do M�s do Pr�ximo Evento: ");
					         String hora2= JOptionPane.showInputDialog("Informe a hora do Projeto: ");
					         String status3= JOptionPane.showInputDialog("Informe o Status de Evento (Executado; Paralisado; Em Execu��o): ");
				        	 try {
				        		 //escritor.notify();
				                 escritor.append(titulo2+
						            		"\n\n ____________________________________\n\n Informa��es sobre agenda: "+
								            "\nDescri��o do Pr�ximo Evento do Projeto Social: "+descricao2+
								            "\n Data do Pr�ximo Evento : "+agendadia2+"/"+agendames2+
								            "\n Hora do pr�ximo Evento: "+hora2+
								            "\n Status do Evento: "+status3); 
				              } catch (IndexOutOfBoundsException e) {
				                 System.out.printf("\nErro: posição inválida (%s).",e.getMessage());
				              }                  
				             JOptionPane.showMessageDialog(null, "Alterado com Sucesso");
				             break;
				   case 3:
				             break;
				         default:
				              JOptionPane.showMessageDialog(null, "Escolha uma das opções válidas");
				    }
				 } while (i!=3);
			} catch (HeadlessException | NumberFormatException e) {
				e.printStackTrace();
			}
			
		}

	}


