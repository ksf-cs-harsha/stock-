package Stock.marketing.Stock.marketing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
class StockPredictionController {

    @GetMapping("/predict")
    public Map<String, Double> predictStockPrice(@RequestParam String stockSymbol,
                                                 @RequestParam int days) {
        // Mock implementation for simplicity
        Map<String, Double> prediction = new HashMap<>();
        prediction.put("AAPL", 150.0); // Example prediction for Apple stock
        prediction.put("GOOGL", 2500.0); // Example prediction for Google stock
        return prediction;
    }
}