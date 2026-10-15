.class public final Lu2/s;
.super Le3/c;
.source "SourceFile"


# instance fields
.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lcom/shungo/app/MainActivity;

.field public g:I


# direct methods
.method public constructor <init>(Lcom/shungo/app/MainActivity;Lc3/e;)V
    .locals 0

    iput-object p1, p0, Lu2/s;->f:Lcom/shungo/app/MainActivity;

    invoke-direct {p0, p2}, Le3/c;-><init>(Lc3/e;)V

    return-void
.end method


# virtual methods
.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lu2/s;->e:Ljava/lang/Object;

    iget p1, p0, Lu2/s;->g:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lu2/s;->g:I

    iget-object p1, p0, Lu2/s;->f:Lcom/shungo/app/MainActivity;

    invoke-virtual {p1, p0}, Lcom/shungo/app/MainActivity;->n(Lc3/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
