package view;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class CadastroPessoFisica extends JFrame{

	MaskFormatter formatTEL = null ;
	MaskFormatter formatCEL = null ;
	MaskFormatter formatRG = null ;
	MaskFormatter formatCPF = null ;
	MaskFormatter formatCEP = null ;
	
	private JRadioButton[] sexo = new JRadioButton[2];
	private JComboBox comboUF = new JComboBox();	
	
	
	JTextField txtVisor = new JTextField();
	
	JLabel label_nome = new JLabel("Nome");
	JTextField nome = new JTextField();
	
	JLabel label_endereco = new JLabel("Endereço");
	JTextField endereco = new JTextField();
	
	JLabel label_bairro = new JLabel("Bairro");
	JTextField bairro = new JTextField();
	
	JLabel label_cep = new JLabel("CEP");
	JFormattedTextField cep = null;
	
	JLabel label_cidade = new JLabel("Cidade");
	JTextField cidade = new JTextField();
	
	JLabel label_uf = new JLabel("Estado - UF");
	JTextField uf = new JTextField();
	
	JLabel label_telefone = new JLabel("Telefone");
	JFormattedTextField telefone = null;
	
	JLabel label_celular = new JLabel("Celular");
	JFormattedTextField celular = null;
	
	JLabel label_sexo = new JLabel("SEXO");
	
	JLabel label_rg = new JLabel("RG");
	JFormattedTextField rg = null;
	
	JLabel label_cpf = new JLabel("CPF");
	JFormattedTextField cpf = null;
	
	JButton salvar = new JButton("salvar");
	JButton limpar = new JButton("limpar");
	JButton imprimir = new JButton("imprimir");
	
	private ButtonGroup group = new ButtonGroup();
	
	model.PessoaFisica pessoaFisica = new model.PessoaFisica();
	
	public CadastroPessoFisica() {
		
		super("Cadastro de Pessoa Física");
		
		Container pane = this.getContentPane();
		
		comboUF.addItem("AC - Acre");
		comboUF.addItem("AL - Alagoas");
		comboUF.addItem("AM - Amapa");
		comboUF.addItem("AP - Macapa");
		comboUF.addItem("BA - Bahia");
		comboUF.addItem("CE - Ceara");
		comboUF.addItem("DF - Distrito Federal");
		comboUF.addItem("ES - Espirito Santo");
		comboUF.addItem("GO - Goias");
		comboUF.addItem("MA - Maranhão");
		comboUF.addItem("MG - Minas Gerais");
		comboUF.addItem("MS - Mato Grosso do Sul");
		comboUF.addItem("MT - Mato Grosso");
		comboUF.addItem("PA - Para");
		comboUF.addItem("PB - paraiba");
		comboUF.addItem("PE - Pernambuco");
		comboUF.addItem("PI - Piaui");
		comboUF.addItem("PR - Parana");
		comboUF.addItem("RJ - Rio de Janeiro");
		comboUF.addItem("RN - Rio Grande do Norte");
		comboUF.addItem("RO - Rondonia");
		comboUF.addItem("RR - Roraima");
		comboUF.addItem("SC - Santa Catarina");
		comboUF.addItem("SE - Sergipe");
		comboUF.addItem("SP - São Paulo");
		comboUF.addItem("TO - Tocantis");
		
		sexo[0] = new JRadioButton("Masculino");
		sexo[1] = new JRadioButton("Feminino");
		group.add(sexo[0]);
		group.add(sexo[1]);
				
		pane.add(label_nome);
		label_nome.setBounds(20,10,250,50);	
	
		pane.add(nome);
		nome.setBounds(20,50,300,50);
		
		pane.add(label_endereco);
		label_endereco.setBounds(350,10,250,50);	
		
		pane.add(endereco);
		endereco.setBounds(350,50,300,50);
		
		pane.add(label_bairro);
		label_bairro.setBounds(20,100,250,50);	
		
		pane.add(bairro);
		bairro.setBounds(20,140,300,50);
				
		pane.add(label_cep);
		label_cep.setBounds(350,100,250,50);	
		
		try{
			formatCEP = new MaskFormatter("#####-###");
			cep = new JFormattedTextField(formatCEP);
		} catch (Exception ex){
			ex.printStackTrace();
		}
		pane.add(cep);
		cep.setBounds(350,140,300,50);
		
		pane.add(label_cidade);
		label_cidade.setBounds(20,190,250,50);	
		
		pane.add(cidade);
		cidade.setBounds(20,240,300,50);
		
		pane.add(label_uf);
		label_uf.setBounds(350,190,250,50);	
		
		pane.add(comboUF);
		comboUF.setBounds(350,240,300,50);
		
		pane.add(label_telefone);
		label_telefone.setBounds(20,290,250,50);	
		
		try{
			formatTEL = new MaskFormatter("(##)####-####");
			telefone = new JFormattedTextField(formatTEL);
		} catch (Exception ex){
			ex.printStackTrace();
		}		
		pane.add(telefone);
		telefone.setBounds(20,340,300,50);
		
		pane.add(label_celular);
		label_celular.setBounds(350,290,250,50);	
		
		try{
			formatCEL = new MaskFormatter("(##)#####-####");
			celular = new JFormattedTextField(formatCEL);
		} catch (Exception ex){
			ex.printStackTrace();
		}		
		pane.add(celular);
		celular.setBounds(350,340,300,50);
		
		pane.add(label_sexo);
		label_sexo.setBounds(20,390,250,50);	
		
		pane.add(sexo[0]);
		sexo[0].setBounds(20,440,100,50);
		
		pane.add(sexo[1]);
		sexo[1].setBounds(130,440,100,50);
		
		pane.add(label_rg);
		label_rg.setBounds(350,390,300,50);
		
		try{
			formatRG = new MaskFormatter("##.###.###-A");
			rg = new JFormattedTextField(formatRG);
		} catch (Exception ex){
			ex.printStackTrace();
		}
		pane.add(rg);
		rg.setBounds(350,440,300,50);
		
		pane.add(label_cpf);
		label_cpf.setBounds(20,490,250,50);	
		
		try{
			formatCPF = new MaskFormatter("###.###.###-##");
			cpf = new JFormattedTextField(formatCPF);
		} catch (Exception ex){
			ex.printStackTrace();
		}
		pane.add(cpf);
		cpf.setBounds(20,540,300,50);
		
		pane.add(salvar);
		salvar.setBounds(350,540,140,50);
		limpar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				pessoaFisica.setNome(nome.getText());
				pessoaFisica.setEndereco(endereco.getText());
				pessoaFisica.setCEP(cep.getText());
				pessoaFisica.setBairro(bairro.getText());
				pessoaFisica.setCidade(cidade.getText());
				//pessoaFisica.setUF(uf.getText());
				pessoaFisica.setTelefone(telefone.getText());
				pessoaFisica.setCelular(celular.getText());
				//pessoaFisica.setSexo(sexo.getText());
				pessoaFisica.setRG(rg.getText());
				pessoaFisica.setCPF(cpf.getText());
			}
		});
		
		
		pane.add(imprimir);
		imprimir.setBounds(507,540,140,50);
		
		pane.add(limpar);
		limpar.setBounds(350,600,297,50);
		limpar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				nome.setText("");
				endereco.setText("");
				bairro.setText("");
				cep.setText("");
				cidade.setText("");
				telefone.setText("");
				celular.setText("");
				rg.setText("");
				cpf.setText("");
			}
		});
		
		this.setLayout(null); // metodo responsavel por definir o posicionamento dos objetos no layout
		this.setVisible(true); // responsavel por deixar a tela visivel
		this.setSize(700,720); // dimensões da tela 
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String args[]){
		
		CadastroPessoFisica pf = new CadastroPessoFisica();
		
	}
	
}
