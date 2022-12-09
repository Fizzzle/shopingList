package com.example.shopinglist.domain

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)

    fun editShopItem(ShopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem

    fun deleteShopItem(shopItem: ShopItem)
    
    fun getShopList() : List<ShopItem>
}