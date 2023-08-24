let numbers = [2, 5, 12, 13, 15, 18, 22];
// 配列から偶数を抽出。
for (let i = 0; i < numbers.length; i++) {
    if (numbers[i] % 2 === 0) {
        let num = numbers[i];
        function isEven() {
            console.log(num + 'は偶数です');
        }
        isEven();
    }else{
        continue;
    }
}
// Carオブジェクト作成。
class Car{

    constructor(gass, number){
        this.gass = gass;
        this.number = number;
    }
// getNumGasメソッド作成
    getNumGas() {
        console.log(`ガソリンは${this.gass}です。ナンバーは${this.number}です`);
    }
}
// Carクラスをインスタンス化。
let car = new Car("出光", 6103);
car.getNumGas();