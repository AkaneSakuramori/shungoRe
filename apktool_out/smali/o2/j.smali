.class public final Lo2/j;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lo2/m;


# direct methods
.method public synthetic constructor <init>(Lo2/m;I)V
    .locals 0

    iput p2, p0, Lo2/j;->b:I

    iput-object p1, p0, Lo2/j;->c:Lo2/m;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 2

    iget v0, p0, Lo2/j;->b:I

    iget-object v1, p0, Lo2/j;->c:Lo2/m;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v1}, Lo2/m;->clear()V

    return-void

    :pswitch_0
    invoke-virtual {v1}, Lo2/m;->clear()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 4

    iget v0, p0, Lo2/j;->b:I

    iget-object v1, p0, Lo2/j;->c:Lo2/m;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v1, p1}, Lo2/m;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_0
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v1, v0, v2}, Lo2/m;->a(Ljava/lang/Object;Z)Lo2/l;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    move-object v0, v3

    :goto_0
    if-eqz v0, :cond_2

    iget-object v1, v0, Lo2/l;->g:Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eq v1, p1, :cond_1

    if-eqz v1, :cond_2

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    move-object v3, v0

    :cond_2
    if-eqz v3, :cond_3

    const/4 v2, 0x1

    :cond_3
    return v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    iget v0, p0, Lo2/j;->b:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lo2/i;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo2/i;-><init>(Lo2/j;I)V

    return-object v0

    :pswitch_0
    new-instance v0, Lo2/i;

    invoke-direct {v0, p0}, Lo2/i;-><init>(Lo2/j;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x0

    iget v1, p0, Lo2/j;->b:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    iget-object v4, p0, Lo2/j;->c:Lo2/m;

    packed-switch v1, :pswitch_data_0

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {v4, p1, v2}, Lo2/m;->a(Ljava/lang/Object;Z)Lo2/l;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v4, v0, v3}, Lo2/m;->c(Lo2/l;Z)V

    :cond_1
    if-eqz v0, :cond_2

    move v2, v3

    :cond_2
    return v2

    :pswitch_0
    instance-of v1, p1, Ljava/util/Map$Entry;

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_4

    :try_start_1
    invoke-virtual {v4, v1, v2}, Lo2/m;->a(Ljava/lang/Object;Z)Lo2/l;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    :cond_4
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_6

    iget-object v5, v1, Lo2/l;->g:Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eq v5, p1, :cond_5

    if-eqz v5, :cond_6

    invoke-virtual {v5, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    :cond_5
    move-object v0, v1

    :cond_6
    if-nez v0, :cond_7

    goto :goto_1

    :cond_7
    invoke-virtual {v4, v0, v3}, Lo2/m;->c(Lo2/l;Z)V

    move v2, v3

    :goto_1
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final size()I
    .locals 2

    iget v0, p0, Lo2/j;->b:I

    iget-object v1, p0, Lo2/j;->c:Lo2/m;

    packed-switch v0, :pswitch_data_0

    iget v0, v1, Lo2/m;->d:I

    return v0

    :pswitch_0
    iget v0, v1, Lo2/m;->d:I

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
