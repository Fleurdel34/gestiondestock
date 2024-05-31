package fr.studi.stock.service.Impl;

import fr.studi.stock.pojo.Produit;
import fr.studi.stock.repository.ProduitRepository;
import fr.studi.stock.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl implements ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    @Override
    public List<Produit> getAllProduit(){
        return this.produitRepository.findAll();
    }

    @Override
    public void createProduit(Produit produit){
        this.produitRepository.save(produit);
    }

    @Override
    public void updateProduit(Long id, Produit produit){
        Produit oldProduit = this.getProduitbyId(id);
        if(oldProduit !=null){
            oldProduit.setDescription(produit.getDescription());
            oldProduit.setPrix(produit.getPrix());
            oldProduit.setNom(produit.getNom());
            oldProduit.setQuantite(produit.getQuantite());
            this.produitRepository.save(oldProduit);
        }
    }

    @Override
    public Produit getProduitbyId(Long id){
        return this.produitRepository.findById(id).orElse(null);
    }

}
