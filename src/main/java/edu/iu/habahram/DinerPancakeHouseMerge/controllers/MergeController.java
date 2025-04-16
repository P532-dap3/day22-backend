package edu.iu.habahram.DinerPancakeHouseMerge.controllers;

import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.DinerRepository;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.PancakeHouseRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/merge")
public class MergeController {

    DinerRepository dinerRepository;

    PancakeHouseRepository panCakeHouseRepository;

    public MergeController(DinerRepository dinerRepository, PancakeHouseRepository panCakeHouseRepository){

        this.panCakeHouseRepository = panCakeHouseRepository;
        this.dinerRepository = dinerRepository;
    }

    @GetMapping
    public List<MenuItem> get() {

        List<MenuItem> dinerMenu = this.dinerRepository.getTheMenu();
        List<MenuItem> panCakeMenu = this.panCakeHouseRepository.getTheMenu();

        List<MenuItem> mergedList = new ArrayList<>();
        mergedList.addAll(dinerMenu);
        mergedList.addAll(panCakeMenu);

        return mergedList;
    }
}
