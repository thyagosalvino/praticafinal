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
				            String titulo= JOptionPane.showInputDialog("Digite o Título do Projeto: ");
				            String objetivo= JOptionPane.showInputDialog("Digite o Objetivo: ");
				            String endereco= JOptionPane.showInputDialog("Digite o Endereço do Projeto: ");
				            String datames= JOptionPane.showInputDialog("Digite o Mês de Íncio: (Informe o mês por número, exemplo: Janeiro = 01; Fevereiro = 02...)");
				            String datadia= JOptionPane.showInputDialog("Digite apenas o Dia de Íncio: ");
				            String status= JOptionPane.showInputDialog("Informe o Status do Projeto: ");
				            String descricao= JOptionPane.showInputDialog("Informe a Descrição do Próximo Evento: ");
				            String agendames= JOptionPane.showInputDialog("Informe o mês do Próximo Evento: ");
				            String agendadia= JOptionPane.showInputDialog("Informe apenas o dia do Mês do Próximo Evento: ");
				            String hora= JOptionPane.showInputDialog("Informe a hora do Projeto: ");
				            String status2= JOptionPane.showInputDialog("Informe o Status de Evento (Executado; Paralisado; Em Execução): ");
				            escritor.append("Projeto Social: \n"+"\n Título do Projeto: "+titulo
				            		+"\n Obejetivo do Projeto: "+objetivo+
				            		"\n Endereço do Projeto: "+endereco+
				            		"\n Data de Ínicio do Projeto: "+datadia+"/"+datames+
				            		"\nStatus do Projeto Social: "+status+
				            		"\n\n ____________________________________\n\n Informações sobre agenda: "+
				            "\nDescrição do Próximo Evento do Projeto Social: "+descricao+
				            "\n Data do Próximo Evento : "+agendadia+"/"+agendames+
				            "\n Hora do próximo Evento: "+hora+
				            "\n Status do Evento: "+status2);
				            JOptionPane.showMessageDialog(null, "Inserido com Sucesso");
				             break;
				         case 2:
				        	 String titulo2= JOptionPane.showInputDialog("Digite o Título do Projeto que deseja adicionar dados a agenda : ");
				        	 String descricao2= JOptionPane.showInputDialog("Informe a Descrição do Próximo Evento: ");
					         String agendames2= JOptionPane.showInputDialog("Informe o mês do Próximo Evento: ");
					         String agendadia2= JOptionPane.showInputDialog("Informe apenas o dia do Mês do Próximo Evento: ");
					         String hora2= JOptionPane.showInputDialog("Informe a hora do Projeto: ");
					         String status3= JOptionPane.showInputDialog("Informe o Status de Evento (Executado; Paralisado; Em Execução): ");
				        	 try {
				        		 //escritor.notify();
				                 escritor.append(titulo2+
						            		"\n\n ____________________________________\n\n Informações sobre agenda: "+
								            "\nDescrição do Próximo Evento do Projeto Social: "+descricao2+
								            "\n Data do Próximo Evento : "+agendadia2+"/"+agendames2+
								            "\n Hora do próximo Evento: "+hora2+
								            "\n Status do Evento: "+status3); 
				              } catch (IndexOutOfBoundsException e) {
				                 System.out.printf("\nErro: posiÃ§Ã£o invÃ¡lida (%s).",e.getMessage());
				              }                  
				             JOptionPane.showMessageDialog(null, "Alterado com Sucesso");
				             break;
				   case 3:
				             break;
				         default:
				              JOptionPane.showMessageDialog(null, "Escolha uma das opÃ§Ãµes vÃ¡lidas");
				    }
				 } while (i!=3);
			} catch (HeadlessException | NumberFormatException e) {
				e.printStackTrace();
			}
			
		}

	}


