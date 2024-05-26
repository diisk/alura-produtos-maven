package br.me.diisk.service;

import br.me.diisk.model.Produto;
import net.suuft.libretranslate.Language;
import net.suuft.libretranslate.Translator;

public class TraduzProdutoService {

    public void traduzir(Produto produto) {
        String name = Translator.translate(
                Language.ENGLISH,
                Language.PORTUGUESE,
                produto.getName());
        String category = Translator.translate(
                Language.ENGLISH,
                Language.PORTUGUESE,
                produto.getCategory());
        String description = Translator.translate(
                Language.ENGLISH,
                Language.PORTUGUESE,
                produto.getDescription());

        produto.update(name, description, category);
    }
}
