package UserReal;


import WineRepository.Wine;
import java.util.ArrayList;
import java.util.List;
import static WineRepository.TotalWine.valueList;
import static java.util.stream.Collectors.*;

public class WineFilteringRepository {

    //필터링 된 와인 리스트
    List<Wine> filteredWineList = new ArrayList<Wine>();
    //구매내역 리스트
    List<Wine> purchaseWineList = new ArrayList<Wine>();
    //장바구니 리스트
    List<Wine> cartWineList = new ArrayList<Wine>();

    // 와인이름으로 필터링하기
    public List<Wine> findWineByWineType(String wineType) {
        filteredWineList = valueList.stream()
                .filter(d -> d.getWineType().equals(wineType))
                .collect(toList());
        return filteredWineList;
    }

    // 와인 국가로 필터링하기
    public List<Wine> findWineByWineOrigin(String wineOrigin) {
        filteredWineList = valueList.stream()
                .filter(d -> d.getOrigin().equals(wineOrigin))
                .collect(toList());
        return filteredWineList;
    }

    // 와인 가격으로 필터링하기
    public List<Wine> findWineByWinePrice(double min, double max) {
        filteredWineList = valueList.stream()
                .filter(d -> d.getPrice()>min &&d.getPrice()<=max)
                .collect(toList());
        return filteredWineList;

    }

    //필터링된 와인 중에서 선택한 와인
    public Wine chooseWine(String wineName) {
        List<Wine> filteredWine = valueList.stream()
                .filter(d -> d.getName().equals(wineName))
                .collect(toList());
        return filteredWine.size() == 0 ? null : filteredWine.get(0);
    }
    
    //구매 내역 리스트에 구매한 와인 담기
    public void purchaseList(Wine choosingWine){
        purchaseWineList.add(choosingWine);
    }
    //구매 내역 리스트 리턴
    public List<Wine> purchaseList(){
        return purchaseWineList.size()==0 ? null : purchaseWineList;
    }

    //장바구니 리스트에 선택한 와인 담기
    public void cartList(Wine choosingWine){
        cartWineList.add(choosingWine);
    }
    //장바구니 리스트 리턴
    public List<Wine> cartList(){
        return cartWineList.size()==0 ? null : cartWineList;
    }
    //장바구니 리스트 중 입력한 이름이 있는지
    public Wine isCartEnteredWine(String wineWantToBuy) {
        List<Wine> cartWine = cartWineList.stream()
                .filter(d -> d.getName().equals(wineWantToBuy))
                .collect(toList());
        return cartWine.size() == 0 ? null : cartWine.get(0);
    }

    //장바구니 리스트에서 특정 와인 pop
    public void popCartWine(Wine popWine){
        cartWineList.remove(popWine);
    }

    //와인 구매 완료하면 전체 와인리스트에서 pop
    public void popTotalWineList(Wine popWine){
        valueList.remove(popWine);
    }
}
