.class public final Lu0/d;
.super Lu0/b;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lu0/b;)V
    .locals 1

    const-string v0, "initialExtras"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lu0/b;-><init>()V

    iget-object v0, p0, Lu0/b;->a:Ljava/util/LinkedHashMap;

    iget-object p1, p1, Lu0/b;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method
