package edu.iu.habahram.DinerPancakeHouseMerge.controllers;

import edu.iu.habahram.DinerPancakeHouseMerge.model.Menu;
import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.CafeRepository;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.DinerRepository;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.MergerRepository;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.PancakeHouseRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/merge")
public class MergeController {
    CafeRepository cafeRepository;
    PancakeHouseRepository pancakeHouseRepository;
    DinerRepository dinerRepository;
    MergerRepository mergerRepository;

    public MergeController(
            CafeRepository _cafeRepository,
            PancakeHouseRepository _pancakeHouseRepository,
            DinerRepository _dinerRepository,
            MergerRepository _mergerRepository){
        this.cafeRepository = _cafeRepository;
        this.pancakeHouseRepository = _pancakeHouseRepository;
        this.dinerRepository = _dinerRepository;
        this.mergerRepository = _mergerRepository;
    }
    @GetMapping
    public List<MenuItem> get() {
        List<MenuItem> result = new ArrayList<>();
        for (Menu menu : mergerRepository.getTheMenus()) {
            Iterator<MenuItem> it1 = menu.createIterator();
            while (it1.hasNext()) {
                result.add(it1.next());
            }
        }
        return result;
    }
}