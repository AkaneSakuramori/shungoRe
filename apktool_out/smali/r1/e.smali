.class public final Lr1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/view/WindowInsets;

.field public final b:Landroid/view/View;

.field public c:I

.field public d:I

.field public final e:[I


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Lr1/e;->e:[I

    iput-object p1, p0, Lr1/e;->b:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final a(Li0/c2;Ljava/util/List;)V
    .locals 1

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Li0/o1;

    iget-object v0, p2, Li0/o1;->a:Li0/n1;

    invoke-virtual {v0}, Li0/n1;->c()I

    move-result v0

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    iget p1, p0, Lr1/e;->d:I

    iget-object p2, p2, Li0/o1;->a:Li0/n1;

    invoke-virtual {p2}, Li0/n1;->b()F

    move-result p2

    const/4 v0, 0x0

    invoke-static {p1, v0, p2}, Lo1/a;->c(IIF)I

    move-result p1

    int-to-float p1, p1

    iget-object p2, p0, Lr1/e;->b:Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/View;->setTranslationY(F)V

    :cond_1
    return-void
.end method
