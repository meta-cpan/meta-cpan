DESCRIPTION = "Net::DNS is a collection of Perl modules that act as a Domain Name System \
(DNS) resolver. It allows the programmer to perform DNS queries that are \
beyond the capabilities of "gethostbyname" and "gethostbyaddr"."

SECTION = "libs"
LICENSE = "MIT"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Net-DNS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://cpan.metacpan.org/authors/id/N/NL/NLNETLABS/Net-DNS-1.05.tar.gz"

SRC_URI[md5sum] = "3e229b4c72e25f850af9dea9ba5082bd"
SRC_URI[sha256sum] = "900198014110af96ebac34af019612dd2ddd6af30178600028c3c940d089d5c8"
RDEPENDS_${PN} += "digest-hmac-perl"

S = "${WORKDIR}/Net-DNS-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
