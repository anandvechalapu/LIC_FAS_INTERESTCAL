import org.springframework.data.jpa.repository.JpaRepository;

import com.sa.fund.master.fundmastercontroller.entity.FundMgmtChargesSlabMstEntity;

public interface FmcsearchFmcInterestRateSlabRepository extends JpaRepository<FundMgmtChargesSlabMstEntity, Long> {

    List<FundMgmtChargesSlabMstEntity> findAll();

    List<FundMgmtChargesSlabMstEntity> findByMinAmount(Double minAmount);

    List<FundMgmtChargesSlabMstEntity> findByMaxAmount(Double maxAmount);

    List<FundMgmtChargesSlabMstEntity> findByInterestRate(Double interestRate);

    List<FundMgmtChargesSlabMstEntity> findByMinAmountAndMaxAmount(Double minAmount, Double maxAmount);

    List<FundMgmtChargesSlabMstEntity> findByMinAmountAndInterestRate(Double minAmount, Double interestRate);

    List<FundMgmtChargesSlabMstEntity> findByMaxAmountAndInterestRate(Double maxAmount, Double interestRate);

    List<FundMgmtChargesSlabMstEntity> findByMinAmountAndMaxAmountAndInterestRate(Double minAmount, Double maxAmount, Double interestRate);

}

package com.sa.fund.master.fundmastercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.fund.master.fundmastercontroller.entity.FundMgmtChargesSlabMstEntity;
import com.sa.fund.master.fundmastercontroller.repository.FmcsearchFmcInterestRateSlabRepository;

@Service
public class FmcsearchFmcInterestRateSlabService {

    @Autowired
    FmcsearchFmcInterestRateSlabRepository fmcsearchFmcInterestRateSlabRepository;

    public List<FundMgmtChargesSlabMstEntity> findAll() {
        return fmcsearchFmcInterestRateSlabRepository.findAll();
    }

    public List<FundMgmtChargesSlabMstEntity> findByMinAmount(Double minAmount) {
        return fmcsearchFmcInterestRateSlabRepository.findByMinAmount(minAmount);
    }

    public List<FundMgmtChargesSlabMstEntity> findByMaxAmount(Double maxAmount) {
        return fmcsearchFmcInterestRateSlabRepository.findByMaxAmount(maxAmount);
    }

    public List<FundMgmtChargesSlabMstEntity> findByInterestRate(Double interestRate) {
        return fmcsearchFmcInterestRateSlabRepository.findByInterestRate(interestRate);
    }

    public List<FundMgmtChargesSlabMstEntity> findByMinAmountAndMaxAmount(Double minAmount, Double maxAmount) {
        return fmcsearchFmcInterestRateSlabRepository.findByMinAmountAndMaxAmount(minAmount, maxAmount);
    }

    public List<FundMgmtChargesSlabMstEntity> findByMinAmountAndInterestRate(Double minAmount, Double interestRate) {
        return fmcsearchFmcInterestRateSlabRepository.findByMinAmountAndInterestRate(minAmount, interestRate);
    }

    public List<FundMgmtChargesSlabMstEntity> findByMaxAmountAndInterestRate(Double maxAmount, Double interestRate) {
        return fmcsearchFmcInterestRateSlabRepository.findByMaxAmountAndInterestRate(maxAmount, interestRate);
    }

    public List<FundMgmtChargesSlabMstEntity> findByMinAmountAndMaxAmountAndInterestRate(Double minAmount, Double maxAmount,
            Double interestRate) {
        return fmcsearchFmcInterestRateSlabRepository.findByMinAmountAndMaxAmountAndInterestRate(minAmount, maxAmount,
                interestRate);
    }
}