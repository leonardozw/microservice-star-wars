import Router from "express"

import CharacterController from "../controller/CharacterController.js"

const router = Router()

router.get('/', CharacterController.findAll)
router.get('/name/:name', CharacterController.findByName)

export default router