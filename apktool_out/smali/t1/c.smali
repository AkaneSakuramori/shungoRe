.class public final Lt1/c;
.super Lt1/d;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lcom/google/android/material/carousel/CarouselLayoutManager;


# direct methods
.method public synthetic constructor <init>(ILcom/google/android/material/carousel/CarouselLayoutManager;I)V
    .locals 0

    iput p3, p0, Lt1/c;->b:I

    iput-object p2, p0, Lt1/c;->c:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-direct {p0, p1}, Lt1/d;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    iget v0, p0, Lt1/c;->b:I

    iget-object v1, p0, Lt1/c;->c:Lcom/google/android/material/carousel/CarouselLayoutManager;

    packed-switch v0, :pswitch_data_0

    iget v0, v1, Ly0/o0;->n:I

    return v0

    :pswitch_0
    iget v0, v1, Ly0/o0;->n:I

    invoke-virtual {v1}, Ly0/o0;->D()I

    move-result v1

    sub-int/2addr v0, v1

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
