.class public final Lp2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm2/c0;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lp2/l;->b:I

    iput-object p2, p0, Lp2/l;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lm2/m;Lcom/google/gson/reflect/TypeToken;)Lm2/b0;
    .locals 3

    iget v0, p0, Lp2/l;->b:I

    iget-object v1, p0, Lp2/l;->c:Ljava/lang/Object;

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object p2

    const-class v0, Ljava/lang/Object;

    if-ne p2, v0, :cond_0

    new-instance v2, Lp2/n;

    check-cast v1, Lm2/a0;

    invoke-direct {v2, p1, v1}, Lp2/n;-><init>(Lm2/m;Lm2/a0;)V

    :cond_0
    return-object v2

    :pswitch_0
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object p1

    const-class p2, Ljava/lang/Number;

    if-ne p1, p2, :cond_1

    move-object v2, v1

    check-cast v2, Lp2/m;

    :cond_1
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
