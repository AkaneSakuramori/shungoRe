.class public final Lc1/h;
.super Lc1/r;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lc1/h;->a:I

    iput-object p1, p0, Lc1/h;->c:Ljava/lang/Object;

    iput-object p3, p0, Lc1/h;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final d(Lc1/q;)V
    .locals 3

    iget v0, p0, Lc1/h;->a:I

    iget-object v1, p0, Lc1/h;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lc1/q;

    invoke-virtual {v1}, Lc1/q;->y()V

    invoke-virtual {p1, p0}, Lc1/q;->v(Lc1/p;)V

    return-void

    :pswitch_0
    check-cast v1, Ln/b;

    iget-object v0, p0, Lc1/h;->c:Ljava/lang/Object;

    check-cast v0, Lc1/s;

    iget-object v0, v0, Lc1/s;->c:Landroid/view/ViewGroup;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1, p0}, Lc1/q;->v(Lc1/p;)V

    return-void

    :pswitch_1
    check-cast v1, Landroid/view/View;

    sget-object v0, Lc1/y;->a:Lc1/c0;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Lc1/z;->i(Landroid/view/View;F)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, p0}, Lc1/q;->v(Lc1/p;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
