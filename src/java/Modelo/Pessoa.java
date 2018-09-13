/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author profe
 */
public class Pessoa {
    
    private int id;
    private String nome;
    private Date datanascimento;
    private Sexo sexo;
    private String datanascimentostr;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDatanascimento() {
        
        return datanascimento;
    }

    public void setDatanascimentostr(String datanascimentostr) {
        this.datanascimentostr = datanascimentostr;
    }
    
     public String getDatanascimentostr() {
        
        Calendar data = Calendar.getInstance();
        data.setTime(datanascimento);
        
        return data.get(Calendar.DAY_OF_MONTH) + "/" + (data.get(Calendar.MONTH)+1) + "/" + data.get(Calendar.YEAR) ;
        
     }
                

    public void setDatanascimento(Date datanascimento) {
        
        Calendar data = Calendar.getInstance();
        data.setTime(datanascimento);
        
        datanascimentostr = data.get(Calendar.DAY_OF_MONTH) + "/" + (data.get(Calendar.MONTH)+1) + "/" + data.get(Calendar.YEAR) ;
        
        this.datanascimento = datanascimento;
        
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Pessoa(int id, String nome, Date datanascimento, Sexo sexo) {
        this.id = id;
        this.nome = nome;
        this.datanascimento = datanascimento;
        this.sexo = sexo;
    }

    public Pessoa() {
    }
    
    public void buscar(Pessoa pessoa) throws ParseException{
                
            if(pessoa.getId()== 1){
            pessoa.setNome("João Carlos");

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date datanascimento = formato.parse("03/08/2001");
            pessoa.setDatanascimento(datanascimento);
            
            Sexo sexo = new Sexo(1, "M", "Masculino");
            pessoa.setSexo(sexo);
            }
            
    }
    
}
