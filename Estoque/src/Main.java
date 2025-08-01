// Estoque , projeto pensando em como funciona um estoque, podendo adicionar novos produtos,
// quantidade e preços além de conseguirmos ver a data de validade do produto
// add funcionalidade para ver se o produto está vencido ou não (utilizando a data de hoje ou qualquer outra)

public class Main {
    public static void main(String[] args) {


        Estoque estoque1 = new Estoque("gás",2,200.00,"02/03/2025" );
        estoque1.TotalValueStock();
        estoque1.ShowStockProduts();



    }
}   