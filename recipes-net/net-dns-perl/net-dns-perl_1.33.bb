DESCRIPTION = "Net::DNS is a collection of Perl modules that act as a Domain Name System \
(DNS) resolver. It allows the programmer to perform DNS queries that are \
beyond the capabilities of "gethostbyname" and "gethostbyaddr"."

SECTION = "libs"
LICENSE = "MIT"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Net-DNS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://cpan.metacpan.org/authors/id/N/NL/NLNETLABS/Net-DNS-1.33.tar.gz"

SRC_URI[md5sum] = "f3ba5295ee588d25dabc74a2ecda296a"
SRC_URI[sha256sum] = "5a40e7cf524e4bd2c33cf03b82b47d5308b712083aa5ee180b0b5af54c71fbd2"
RDEPENDS:${PN} += "digest-hmac-perl"
RRECOMMENDS:${PN} += "digest-bubblebabble-perl"

S = "${WORKDIR}/Net-DNS-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
