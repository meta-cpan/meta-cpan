DESCRIPTION = "This utility is designed to write a Makefile for an extension module from a \
Makefile.PL. It is based on the Makefile.SH model provided by Andy \
Dougherty and the perl5-porters."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-MakeMaker"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/B/BI/BINGOS/ExtUtils-MakeMaker-7.64.tar.gz"

SRC_URI[md5sum] = "5c417a5ff2236c0ee7ab3412c4575ad8"
SRC_URI[sha256sum] = "4a6ac575815c0413b1f58967043cc9f2e166446b73c687f9bc62b5eaed9464a0"

S = "${WORKDIR}/ExtUtils-MakeMaker-${PV}"

inherit cpan allarch

RDEPENDS:${PN} += "perl-module-b"
RDEPENDS:${PN} += "perl-module-base"
RDEPENDS:${PN} += "perl-module-cwd"
RDEPENDS:${PN} += "perl-module-encode-alias"
RDEPENDS:${PN} += "perl-module-extutils-manifest"
RDEPENDS:${PN} += "perl-module-i18n-langinfo"
RDEPENDS:${PN} += "perl-module-version"

do_configure:append:class-native() {
	sed -i -e "s:\(PERLRUN = .*\):\1 \"-Ilib\":" Makefile
}

do_compile:prepend:class-native() {
	export PERL5LIB="${PERL_ARCHLIB}"
}

do_install:prepend:class-native() {
	export PERL5LIB="${PERL_ARCHLIB}"
}

inherit update-alternatives

ALTERNATIVE_PRIORITY = "90"

ALTERNATIVE:${PN} = "instmodsh"
ALTERNATIVE_LINK_NAME[instmodsh] = "${bindir}/instmodsh"

BBCLASSEXTEND = "native"
