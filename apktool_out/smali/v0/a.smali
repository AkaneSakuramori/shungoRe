.class public final Lv0/a;
.super Landroidx/lifecycle/n0;
.source "SourceFile"


# static fields
.field public static final d:La4/x;


# instance fields
.field public final c:Ln/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La4/x;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, La4/x;-><init>(I)V

    sput-object v0, Lv0/a;->d:La4/x;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/lifecycle/n0;-><init>()V

    new-instance v0, Ln/l;

    invoke-direct {v0}, Ln/l;-><init>()V

    iput-object v0, p0, Lv0/a;->c:Ln/l;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, Lv0/a;->c:Ln/l;

    iget v1, v0, Ln/l;->d:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-gtz v1, :cond_1

    iget-object v4, v0, Ln/l;->c:[Ljava/lang/Object;

    move v5, v3

    :goto_0
    if-ge v5, v1, :cond_0

    aput-object v2, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    iput v3, v0, Ln/l;->d:I

    return-void

    :cond_1
    iget-object v0, v0, Ln/l;->c:[Ljava/lang/Object;

    aget-object v0, v0, v3

    invoke-static {v0}, La;->n(Ljava/lang/Object;)V

    throw v2
.end method
