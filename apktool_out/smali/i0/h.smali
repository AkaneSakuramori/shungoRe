.class public final Li0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Li0/g;


# direct methods
.method public constructor <init>(Li0/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/h;->a:Li0/g;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li0/h;->a:Li0/g;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
