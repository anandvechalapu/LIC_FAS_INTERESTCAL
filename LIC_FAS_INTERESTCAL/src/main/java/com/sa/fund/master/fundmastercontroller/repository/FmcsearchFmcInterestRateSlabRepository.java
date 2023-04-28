@Repository
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

package com.sa.fund.master.fundmastercontroller.repository;