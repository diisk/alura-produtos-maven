package br.me.diisk;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;

import br.me.diisk.model.Produto;
import br.me.diisk.service.TraduzProdutoService;

public class Main {
    public static void main(String[] args) throws IllegalStateException, FileNotFoundException {
        List<Produto> produtos = 
        new CsvToBeanBuilder(new FileReader("src/main/resources/products.csv"))
        .withType(Produto.class).build().parse();
        

        for(Produto produto: produtos){
            System.out.println(produto);
        }

        TraduzProdutoService tradutor = new TraduzProdutoService();
        for(Produto produto: produtos){
            tradutor.traduzir(produto);
            System.out.println(produto);
        }
    }
}