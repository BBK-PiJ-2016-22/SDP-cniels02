package observer


// Observable
trait Subject {

  def subscribeObserver(observer: Observer)

  def unSubscribeObserver(observer: Observer)

  def notifyObservers()

  def subjectDetails: String
}
