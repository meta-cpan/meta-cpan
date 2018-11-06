DESCRIPTION = "Net::DNS is a collection of Perl modules that act as a Domain Name System \
(DNS) resolver. It allows the programmer to perform DNS queries that are \
beyond the capabilities of "gethostbyname" and "gethostbyaddr"."

SECTION = "libs"
LICENSE = "MIT"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Net-DNS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://cpan.metacpan.org/authors/id/N/NL/NLNETLABS/Net-DNS-1.18.tar.gz"

SRC_URI[md5sum] = "67af7e5c1c339f60c45c1054374bd8ee"
SRC_URI[sha256sum] = "52ce1494fc9707fd5a60ed71db5cde727157b7f2363787d730d4d1bd9800a9d3"
RDEPENDS_${PN} += "digest-hmac-perl"
RDEPENDS_${PN} += "io-socket-ip-perl"

S = "${WORKDIR}/Net-DNS-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
