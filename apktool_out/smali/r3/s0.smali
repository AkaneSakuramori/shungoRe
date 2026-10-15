.class public final Lr3/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr3/y;
.implements Lr3/c;


# static fields
.field public static final b:Lr3/s0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr3/s0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lr3/s0;->b:Lr3/s0;

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 0

    return-void
.end method

.method public final d(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NonDisposableHandle"

    return-object v0
.end method
