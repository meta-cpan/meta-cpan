DESCRIPTION = "Net::DNS is a collection of Perl modules that act as a Domain Name System \
(DNS) resolver. It allows the programmer to perform DNS queries that are \
beyond the capabilities of "gethostbyname" and "gethostbyaddr"."

SECTION = "libs"
LICENSE = "MIT"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Net-DNS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://cpan.metacpan.org/authors/id/N/NL/NLNETLABS/Net-DNS-1.27.tar.gz"

SRC_URI[md5sum] = "204e08e5c8042ce0e7d7f0851af46d50"
SRC_URI[sha256sum] = "f336277710f3672095b23efe0735d8093fc493070944c57c4ec39191a52abd41"
RDEPENDS_${PN} += "digest-hmac-perl"

S = "${WORKDIR}/Net-DNS-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
